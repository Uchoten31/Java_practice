package exday1;

public class Prob1_1 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*10)+1;		//	1～10の乱数を発生
		int b = (int)(Math.random()*10)+1;		//	1～10の乱数を発生
		int result1 = add(a,b);		//	2つの数の和を求める
		int result2 = sub(a,b);		//	2つの数の差を求める
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println(a + " + " + b + " = " + result1);
		System.out.println(a + " - " + b + " = " + result2);
	}
	//	足し算
	static int add(int a,int b) {
		return a + b;
	}
	//	引き算
	static int sub(int a,int b) {
		return a - b;
	}

}
