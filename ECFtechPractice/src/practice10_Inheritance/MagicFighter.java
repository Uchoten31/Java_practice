package practice10_Inheritance;

public class MagicFighter extends Fighter {
	
	
	//	メンバ変数
	int mp;
	
	//	コンストラクタ
	public MagicFighter() {
		this.name = "魔法戦士";
		this.mp = 20;
	}
	
	//	メソッド
	public void attack() {
		System.out.println(this.name + "の魔法攻撃");
		System.out.println("敵に" + (this.atk + this.mp) + "のダメージ！");
	}

}
