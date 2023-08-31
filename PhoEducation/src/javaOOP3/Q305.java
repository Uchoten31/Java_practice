package javaOOP3;

import java.util.HashMap;

public class Q305 {
	
	public static void main(String[] args) {
		
        // 金庫インスタンスの作成
        StrongBox guard = new StrongBox();
        
        // 秘密の言葉変数の宣言
        String secret = null;
        try {
            // 1つ目の宝物を格納
            secret = "sgf01";
            guard.store(secret, new Treasure("ダイヤの指輪"));
            
            // 2つ目の宝物を格納
            secret = "zkq02";
            guard.store(secret, new Treasure("真珠のネックレス"));
            
            // 3つ目の宝物を格納
            secret = "xrt03";
            guard.store(secret, new Treasure("金のブレスレット"));
            
            // 4つ目の宝物を格納（秘密の言葉が重複）
            secret = "xrt03";
            guard.store(secret, new Treasure("プラチナのイヤリング"));
            
        } catch(DuplicateSecretException e) {
            System.out.println("秘密の言葉「" + secret + "」はすでにつかわれています");
        }
        
        System.out.println();
        
        try {
            // 1つ目の宝物を取得
            secret = "sgf01";
            Treasure treasure1 = guard.getTreasure(secret);
            System.out.println(treasure1 + "をゲットしました！");
            
            // 2つ目の宝物を取得
            secret = "zkq02";
            Treasure treasure2 = guard.getTreasure(secret);
            System.out.println(treasure2 + "をゲットしました！");
            
            // 3つ目の宝物を取得（秘密の言葉が不正）
            secret = "xrr03";
            Treasure treasure3 = guard.getTreasure(secret);
            System.out.println(treasure3 + "をゲットしました！");
            
        } catch(IllegalSecretException e) {
            System.out.println("秘密の言葉「" + secret + "」は不正です");
        }
    }
}

// ここに宝物クラスを作成してください
class Treasure {
	
	private String type;
	
	// コンストラクタ
	public Treasure(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type;
	}
	
}


// ここに秘密の言葉不正例外クラスを作成してください
class IllegalSecretException extends Exception {}


// ここに秘密の言葉重複例外クラスを作成してください
class DuplicateSecretException extends Exception {}


// ここに金庫クラスを作成してください
class StrongBox {
	
	HashMap<String, Treasure> treasures;
	
	// コンストラクタ
	public StrongBox() {
		treasures = new HashMap<String, Treasure>();
	}
	
	// 秘密の言葉と宝物を金庫に格納するstoreメソッド
	public void store(String secret, Treasure treasure) throws DuplicateSecretException {
		
		// 秘密の言葉がすでに使用されている場合
		if(treasures.containsKey(secret)) {
			throw new DuplicateSecretException();
		}
		// 秘密の言葉がまだ使用されていない場合
		else {
			treasures.put(secret, treasure);
			System.out.println(treasure + "を金庫に格納しました！");
		}
		
	}
	
	// 秘密の言葉に対する宝物オブジェクトを取得するgetTreasureメソッド
	public Treasure getTreasure(String secret) throws IllegalSecretException {
		
		// 秘密の言葉が不正の場合
		if(treasures.get(secret) == null) {
			
			// 秘密の言葉不正例外をスローする
			throw new IllegalSecretException();
			
		} else {
			
			// 宝物を戻り値として返す
			return treasures.get(secret);
		}
		
		
	}
	
}



