package practice12_abstraction_polymorphism;

public abstract class Item {

	String name;
	int value;
	
	//	コンストラクタ
	Item(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	
	//	抽象メソッド
	public abstract void use();
}
