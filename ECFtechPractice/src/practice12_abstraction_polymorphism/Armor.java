package practice12_abstraction_polymorphism;

public class Armor extends Item{
	
	//	コンストラクタ
	Armor(String name, int value) {
		super(name, value);
	}
	
	
	//	抽象メソッド
	public void use() {
		System.out.println(name + "を身に着けた");
		System.out.println("守備力が" + value + "上がった");
	}
}
