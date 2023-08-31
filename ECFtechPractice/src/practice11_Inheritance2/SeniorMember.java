package practice11_Inheritance2;

public class SeniorMember extends Member{

	//	コンストラクタ
	public SeniorMember() {
		super("シニア会員");
	}
	
	
	//	メソッド
	public int getMonthlyFee() {
		return (int)(super.getMonthlyFee() * 0.7);
	}
	
	
	
}
