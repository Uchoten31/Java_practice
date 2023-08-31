package practice10_Inheritance;

public class Fighter {
	
	
	//	メンバ変数
	String name;
	int atk;
	
	//	コンストラクタ
	public Fighter() {
		this.name = "戦士";
		this.atk = 10;
	}
	
	//	メソッド
	public void attack() {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に" + this.atk + "のダメージ！");
	}

}
