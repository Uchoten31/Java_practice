package practice10_Inheritance;

public class Q4 {
	
	 public static void main(String[] args) {
		 RectAngle rect = new RectAngle(8, 5);
		 //①rectのもつgetMensekiメソッドを呼び出し、戻り値を表示してください
		 
		 System.out.println(rect.getMenseki());
		 
		 Square square = new Square(10);
		 //②squareのもつgetMensekiメソッドを呼び出し、戻り値を表示してください
		 System.out.println(square.getMenseki());

	 }	
}
