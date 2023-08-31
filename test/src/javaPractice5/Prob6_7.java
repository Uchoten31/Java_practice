package javaPractice5;

import java.io.IOException;

public class Prob6_7 {

	public static void main(String[] args) throws IOException
	{
		for(int n = 10000; n < 10100; n++) {
			if(IsPrimeNumber(n)) {
				System.out.println(n);
			}
		}
		
		
		
	}
	
	static boolean IsPrimeNumber(int a) {
		
		if(a < 2) {
			return false;
		}
		
		for(int i = 2; i < a; i++) {
			if(a % i == 0) {
				return false;
			}
		}
		
		return true;
		
	}

}
