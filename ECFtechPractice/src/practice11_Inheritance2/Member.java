package practice11_Inheritance2;

public class Member {

	//	メンバ変数
	private String name;
	private int monthlyFee;
	
	
	//	コンストラクタ
	public Member(String name) {
		this.name = name;
		this.monthlyFee = 8000;
	}
	
	
	//	メソッド
	public String getName() {
		return name;
	}
	
	public int getMonthlyFee() {
		return monthlyFee;
	}
	
	public boolean isUsable(int hour) {
		return true;
	}
	
	
}
