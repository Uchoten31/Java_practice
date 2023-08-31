package practice11_Inheritance2;

public class Circle {
	
	//	メンバ変数
	public static final double Pl = 3.14;
	private int hankei;
	
	
	//	コンストラクタ
	public Circle(int hankei) {
		this.hankei = hankei;
	}
	
	
	//	メソッド
	public double getArea() {
		return Pl * hankei * hankei;
	}

}
