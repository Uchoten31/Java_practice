package practice10_Inheritance;

public class RectAngle {
	
	//	メンバ変数
	int haba;
	int takasa;
	
	
	//	コンストラクタ
	public RectAngle(int haba, int takasa) {
		this.haba = haba;
		this.takasa = takasa;
	}
	
	//	メソッド
	public int getMenseki() {
		return this.haba * this.takasa;
	}

}
