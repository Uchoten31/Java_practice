package javaOOP2;

public class Q217 {
	public static void main(String[] args) {
        // 自動車オブジェクトの生成
        Car mycar = new Car(123, "ロミオ", 0.8);
        // ガソリンがなくなるまで走行する
        try {
            while(true) {
                // 走行する
                mycar.run();
            }
        } catch(GasolineException e) {
            System.out.println(e.getMessage());
        }
    }
}
// ここに車クラスを作成してください
class Car {
	// ナンバーを表すフィールド
	private int number;
	
	// 車種を表すフィールド
	private String type;
	
	// ガソリン量を表すフィールド
	private double gas;
	
	// コンストラクタ
	public Car(int number, String type, double gas) {
		this.number = number;
		this.type = type;
		this.gas = gas;
	}
	
	// 車の走行を表すrunメソッド
	public void run() throws GasolineException {
		if(gas < 0.1) {
			throw new GasolineException("ナンバー" + number + "の" + type + "はガソリン不足のため走行できません。");
		} else {
			System.out.println("ナンバー" + number + "の" + type + "は走行しています。");
			gas -= 0.1;
		}
	}
}

// ここにガス欠例外クラスを作成してください
class GasolineException extends Exception {
	
	public GasolineException(String message) {
		super(message);
	}
}

