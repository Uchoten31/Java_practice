package joytasNet_todoList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoApp {

	public static void main(String[] args) throws Exception{
		// ユーザーからの入力を受け取る
		// Scannerインスタンスの作成
		Scanner sc = new Scanner(System.in);
		// ファイルオブジェクトの作成（セーブ用）
		File file = new File("todo.csv");
		
		// ToDoインスタンスを格納するArrayList
		ArrayList<ToDo> list;
		
		// セーブデータの有無で処理を分ける
		if(file.exists()) {
			list = loadFile(file);
		} else {
			list = new ArrayList<>();
		}
		if(list.size() == 0){
		      System.out.println("ToDoは1件もありません");
	    }else{
	      displayList(list);
	    }
		
		System.out.println("****TodoApp****");
		// メニューの表示->選択->何かしら処理　を繰り返す
		while(true) {
			System.out.println("——操作を入力してください。——");
			System.out.print("1/登録 2/重要度変更 3/削除 4/終了>> ");
			int select = sc.nextInt();
			// 入力によって操作を分岐する
			switch(select){
				// ToDoの登録をする
				case 1:
					addItem(list, sc);
					break;
				// 重要度を変更する
				case 2:
					updateItem(list, sc);
					break;
				// ToDoを削除する
				case 3:
					deleteItem(list, sc);
					break;
				default:
					System.out.println("アプリケーションを終了します");
					saveFile(file, list);
					return;
					
			}
			// リストの内容を表示する
			displayList(list);
		}
	}
	// 重要度でソートを行うメソッド
	static void sortList(ArrayList<ToDo> list) {
		for(int i = 0; i < list.size(); i++) {
			for(int j = i + 1; j < list.size(); j++) {
				if(list.get(i).getImportance() < list.get(j).getImportance()) {
					ToDo temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
	}
	
	// listの内容を表示するメソッド
	static void displayList(ArrayList<ToDo> list) {
		sortList(list);
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("%d・・・%s%n", i, list.get(i).showStatus());
		}
	}
	
	// ToDoの内容を登録するメソッド
	static void addItem(ArrayList<ToDo> list, Scanner sc) {
		// ToDoの内容を入力してもらう
		System.out.println("新規ToDoを作成します。");
	    System.out.print("Todo内容を入力してください>> ");
	    String title = sc.next();
	    // 重要度を入力してもらう
	    System.out.print("重要度を1~10(最大)で入力してください>> ");
	    int importance = sc.nextInt();
	    // listに追加する
	    ToDo t = new ToDo(title, importance);
	    list.add(t);
	    System.out.println("1件追加しました。");
	}
	
	// 重要度を変更するメソッド
	static void updateItem(ArrayList<ToDo> list, Scanner sc) {
		// listがまだない場合、処理を終了する
		if(list.size() == 0) {
			System.out.println("まだToDoがありません");
		    return;
		}
		// 変更するToDoを選択してもらう
		System.out.printf("重要度を変更します。番号を入力してください。0~%d>> ", list.size()-1);
		int no = sc.nextInt();
		ToDo t = list.get(no);
		System.out.print("重要度を再設定してください>>");
		int importance = sc.nextInt();
		t.changeImportance(importance);
	}
	
	// ToDoを削除するメソッド
	static void deleteItem(ArrayList<ToDo> list, Scanner sc) {
		System.out.printf("Todoを削除します。番号を入力してください。0~%d>> ", list.size()-1);
		int no = sc.nextInt();
		list.remove(no);
		System.out.println("1件削除しました。");
	}
	
	// ファイルの読み込みを行うメソッド
	static ArrayList<ToDo> loadFile(File file) throws Exception {
		// リターンするlistを作成
		ArrayList<ToDo> list =new ArrayList<>();
		// 読み込みはfis
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		// 読み込み時のイディオム
		String line;
		while((line = br.readLine())!=null){
			// csvデータなのでカンマでsplit
			String[] values = line.split(",");
			// タイトルの取り出し
			String title = values[0];
			// 重要度の取り出し
			int importance = Integer.parseInt(values[1]);
			// 2つの情報をもとにToDoインスタンスを作成
			ToDo t = new ToDo(title, importance);
			// リストに加える
			list.add(t);
		}
		//br終了処理
		br.close();
		//作成されたlistを返却する
		return list;
	}
	
	// ファイルの書き込み処理を行うメソッド
		static void saveFile(File file,ArrayList<ToDo> list) throws Exception{
			//書き込みはfos
			FileOutputStream fos = new FileOutputStream(file);
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);

			//引数で受け取ったlistを拡張for文で回す
			for(ToDo t : list){
				//インスタンスの情報をcsvで書き込む
				bw.write(t.toCSV());
				//改行
				bw.newLine();
			}
			//ファイルを閉じる
			bw.close();
		}

}


