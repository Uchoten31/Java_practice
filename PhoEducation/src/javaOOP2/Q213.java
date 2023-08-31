package javaOOP2;

public class Q213 {
	public static void main(String[] args) {
        // アスリート配列オブジェクトの生成
        Athlete[] athlete = {
                new Swimmer("北島光一"),
                new MarathonRunner("高橋昭子"),
                new Swimmer("岩崎正子"),
                new MarathonRunner("野口みきえ")
        };
        
        // 自己紹介
        for(int i = 0; i < athlete.length; i++) {
            System.out.println(athlete[i]);
        }
        System.out.println();
        
        
        // アスリートの種目に応じたメソッドの実行
        for(Athlete ath : athlete) {
        	if(ath instanceof Swimmer) {
        		((Swimmer)ath).swim();
        	} else if (ath instanceof MarathonRunner) {
        		((MarathonRunner)ath).run();
        	} else {
        		System.out.println("unknown");
        	}
        }
        
    }
}
// Athlete抽象クラス
abstract class Athlete {
	
    // 選手名
    protected String name;
    
    // 種目名取得メソッド（抽象メソッド）
    public abstract String getType();
    
    @Override
    public String toString() {
        return "私の名前は" + name + "、" + getType() + "の選手です。";
    }
}

// ここにSwimmerクラスを作成してください
class Swimmer extends Athlete {
	// 種目名を表す定数
	public static final String TYPE = "水泳";
	
	// コンストラクタ
	public Swimmer(String name) {
		this.name = name;
	}
	
	// 種目名取得メソッドを実装
	public String getType() {
		return TYPE;
	}
	
	// 泳ぐことを表すメソッド
	public void swim() {
		System.out.println(name + "は泳ぎました。");
	}
	
}

// ここにMarathonRunnerクラスを作成してください
class MarathonRunner extends Athlete {
	// 種目名を表す定数
	public static final String TYPE = "マラソン";
	
	// コンストラクタ
	public MarathonRunner(String name) {
		this.name = name;
	}
	
	// 種目名取得メソッドを実装
	public String getType() {
		return TYPE;
	}
	
	// 泳ぐことを表すメソッド
	public void run() {
		System.out.println(name + "は走りました。");
	}
	
}

