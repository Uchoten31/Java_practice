package exday3;

public abstract class AirPlane {

	//	typeフィールド
	private String type;
	//	引数付きコンストラクタ
	public AirPlane(String type) {
		this.type = type;
	}
	
	//	飛行する（抽象メソッド）
	public abstract void fly();
	
	public abstract void target();
	
}
