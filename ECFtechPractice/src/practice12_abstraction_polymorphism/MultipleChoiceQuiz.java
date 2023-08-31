package practice12_abstraction_polymorphism;

public class MultipleChoiceQuiz extends Quiz{
	
	String[] answers;
	
	//	コンストラクタ
	public MultipleChoiceQuiz(String main, String[] answers) {
		super(main);
		this.answers = answers;
	}
	
	//	メソッド
	public void displayHeader() {
		System.out.println("「次の問いについて、正しいものを４つの中から選びなさい」");
	}
	
	public void displayMain() {
		super.displayMain();
		for(int i = 0; i < answers.length; i++) {
			System.out.println( (i+1) + ":" + answers[i]);
		}
	}

}
