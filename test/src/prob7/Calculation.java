package prob7;

public class Calculation {
	//	メンバ変数number1
	private int number1;
	//	メンバ変数number2
	private int number2;
	
	//	number1のセッター。引数を代入する。
	public void setNumber1(int number) {
		this.number1 = number;
	}
	//	number2のセッター。引数を代入する。
	public void setNumber2(int number) {
		this.number2 = number;
	}
	//	number1のゲッター。値を取得する
	public int getNumber1() {
		return this.number1;
	}
	//	number2のゲッター。値を取得する
	public int getNumber2() {
		return this.number2;
	}
	//	number1とnumber2の和を返す。
	public int add() {
		return this.number1 + this.number2;
	}
	//	number1とnumber2の差を返す。
	public int sub() {
		return this.number1 - this.number2;
	}

	
}
