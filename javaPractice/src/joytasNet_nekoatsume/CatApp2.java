package joytasNet_nekoatsume;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class CatApp2{
	public static void main(String[] args) throws Exception{
		/**
		 * 猫の種類をランダムに決めるための
		 * Randomインスタンスと
		 * ユーザーからの入力を受けとるための
		 * Scannerインスタンス
		 * をnewする
		 */
		Random rand=new Random();
		Scanner sc = new Scanner(System.in);
		
		// 猫の種類を配列型定数で定義する
		final String[] TYPES={"黒","白","茶トラ"};
		// ファイルオブジェクトの作成（セーブ用）
		File file = new File("catlist.csv");
		
		// Catインスタンスを格納するArrayList
			/**
			 * 猫を何匹でも集められる仕様なので、
			 * 要素数が決まっている配列ではなく、ArrayListを使用
			 */
		ArrayList<Cat> list;
		if(file.exists()){
			//セーブデータがあったらそれをもとにlistを作る処理
			list=loadFile(file);
		}else{
			//初回時（セーブデータなし）
			list=new ArrayList<>();
		}
		
		System.out.println("***猫集め***");
		// メニューの表示->選択->何かしら処理　を繰り返す
		while(true){
			System.out.print("1.集める 2.遊ぶ 3.終了>>");
			int select = sc.nextInt();
			// 3.終了 が選択されたら、結果を表示しループを抜ける
			if(select == 3){
				System.out.println("***結果***");
				for(Cat c :list){
					System.out.println(c.showStatus());
				}
				System.out.println("また遊んでね。おしまい");
				saveFile(file,list);
				return;
			}
			// 1.集める が選択された場合
			if(select == 1){
				// 猫の種類をランダムで取得
				String type=TYPES[rand.nextInt(TYPES.length)];
				// 取得した猫の種類を表示
				System.out.printf("%s猫を見つけた!%n",type);
				// 取得した猫の名前を入力してもらう
				System.out.print("この猫に名前をつけてください>>");
				String name=sc.next();
				// 取得したtype,nameからCatインスタンスを生成
				Cat cat = new Cat(name,type);
				// ArrayListに格納する
				list.add(cat);
				// 猫（名前）が仲間になったことを表示
				System.out.println(cat.name+"が仲間に加わった");
			// 2.遊ぶ が選択された場合 
			}else if(select == 2){
				// まだ猫がいない場合の処理
				if(list.size() == 0){
					System.out.println("まだ遊ぶ猫がいません。。。");
					continue;
				}
				// 遊べる猫（ArrayListの中身）の表示
				for(int i=0;i<list.size();i++){
					System.out.printf("%d・・・%s%n",i,list.get(i).showStatus());
				}
				// どの猫と遊ぶか、リストの番号を入力してもらう
				System.out.print("どの猫と遊びますか?>>");
				int no = sc.nextInt();
				// 選択した猫にplayメソッドの実施
				list.get(no).play();
				// sortCatメソッドの実行
				sortCat(list);
			}
		}
	}
	// 親密度でソートを行うメソッド(単純ソートのアルゴリズム)
	static void sortCat(ArrayList<Cat> list){
		for(int i=0;i<list.size()-1;i++){
			for(int j=i+1;j<list.size();j++){
				if(list.get(i).intimacy < list.get(j).intimacy){
					Cat temp=list.get(i);
					list.set(i,list.get(j));
					list.set(j,temp);
				}
			}
		}
	}
	// ファイルの読み込み処理を行うメソッド
	static ArrayList<Cat> loadFile(File file) throws Exception{
		//リターンするlistを作成
		ArrayList<Cat> list =new ArrayList<>();
		//読み込みはfis
		FileInputStream fis=new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		//読み込み時のイディオム
		String line;
		while((line = br.readLine())!=null){
			//csvデータなのでカンマでsplit
			String[] values=line.split(",");
			//名前の取り出し
			String name=values[0];
			//猫種類の取り出し
			String type=values[1];
			//親密度の取り出し
			int intimacy = Integer.parseInt(values[2]);
			//３つの情報をもとにCatインスタンスを作成
			Cat c = new Cat(name,type,intimacy);
			//リストに加える
			list.add(c);
		}
		//br終了処理
		br.close();
		//作成されたlistを返却する
		return list;
	}
	// ファイルの書き込み処理を行うメソッド
	static void saveFile(File file,ArrayList<Cat> list) throws Exception{
		//書き込みはfos
		FileOutputStream fos = new FileOutputStream(file);
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);

		//引数で受け取ったlistを拡張for文で回す
		for(Cat c :list){
			//インスタンスの情報をcsvで書き込む
			bw.write(c.toCSV());
			//改行
			bw.newLine();
		}
		//ファイルを閉じる
		bw.close();
	}
}

class Cat{
	// 猫の名前
	String name;
	// 猫の種類
	String type;
	// 猫の親密度
	int intimacy=0;
	
	// コンストラクタ
	Cat(String name,String type){
		this.name=name;
		this.type=type;
	}
	// コンストラクタ２
	Cat(String name,String type,int intimacy){
		this(name,type);
		this.intimacy=intimacy;
	}
	// Catインスタンスの情報をreturnするメソッド
	String showStatus(){
		return String.format("%s[%s](%d)",this.name,this.type,this.intimacy);
	}
	// 遊ぶことで親密度があがるメソッド
	void play(){
		System.out.println(this.name+"と遊んだ");
		System.out.println("...");
		System.out.println(this.name+"の親密度がアップした!");
		this.intimacy++;
	}
	// Catインスタンス情報をcsvに出力するメソッド
	String toCSV(){
		return String.format("%s,%s,%d",this.name,this.type,this.intimacy);
	}
}
