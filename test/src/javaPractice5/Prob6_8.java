package javaPractice5;

import java.io.IOException;

public class Prob6_8 {

	public static void main(String[] args) throws IOException
	{
		for(int n = 11; n <= 20; n++) {
			System.out.print( Fibonacci(n) + " " );
		}
		
		
		
	}
	
	static int Fibonacci(int n) {
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		} else {
			return Fibonacci(n - 2) + Fibonacci(n - 1);
		}
		
		
	}

}
