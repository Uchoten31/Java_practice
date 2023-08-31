package practice11_Inheritance2;

public class Cylinder extends Circle{
	
	//	メンバ変数
	private int height;
	
	
	//	コンストラクタ
	public Cylinder(int hankei, int height) {
		super(hankei);
		this.height = height;
	}
	
	
	//	メソッド
	public double getVolume() {
		return super.getArea() * height;
	}

}
