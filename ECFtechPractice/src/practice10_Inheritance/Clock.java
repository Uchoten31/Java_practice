package practice10_Inheritance;

public class Clock {
	
	//	メンバ変数
	String time;
	
	
	//	コンストラクタ
	public Clock(String time) {
		this.time = time;
	}

	
	//	メソッド
	public void showTime() {
		System.out.println(this.time + "です。");
	}
	
	
}
