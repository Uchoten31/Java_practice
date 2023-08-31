package practice12_abstraction_polymorphism;

public class Buki extends Item{

	//	コンストラクタ
	Buki(String name, int value) {
		super(name, value);
	}
	
	public void use() {
		System.out.println(name + "でこうげき!!");
		System.out.println("敵に" + value + "のダメージ!");
	}
}
