package practice12_abstraction_polymorphism;

public class QuizViewer {
	
	public static int count;
	
	//	メソッド
	public static void showQuiz(Quiz quiz) {
		count++;
		System.out.println("<第" + count + "問>");
		quiz.displayHeader();
		quiz.displayMain();
		System.out.println();
	}

}
