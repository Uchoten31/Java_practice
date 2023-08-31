package practice12_abstraction_polymorphism;

public class Quiz {
	
	private String main;
	
	//	コンストラクタ
	public Quiz(String main) {
		this.main = main;
	}
	
	//	メソッド
	public void displayHeader() {
		System.out.println("「次の問いに答えなさい」");
	}
	
	public void displayMain() {
		System.out.println(main);
	}

}
