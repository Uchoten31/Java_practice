package practice12_abstraction_polymorphism;

public class BlankQuiz extends Quiz{
	
	public int blankCount;
	
	//	コンストラクタ
	public BlankQuiz(String main, int blankCount) {
		super(main);
		this.blankCount = blankCount;
	}
	
	//	メソッド
	public void displayHeader() {
		System.out.println("「次の文の空欄を埋めなさい」");
	}
	
	public void displayMain() {
		super.displayMain();
		for(int i = 0; i < blankCount; i++) {
			System.out.println( (i+1) + ". ______________");
		}
	}

}
