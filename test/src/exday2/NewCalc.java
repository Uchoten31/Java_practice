package exday2;

public class NewCalc extends FundCalc{
	
	private int mul = 0;
	private int div = 0;
	
	//	フィールドnumber1、number2の積
	public int mul() {
		return number1 * number2;
	}
	
	//	フィールドnumber1、number2の商
	public int div() {
		return number1 / number2;
	}
	
}
