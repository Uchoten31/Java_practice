package javaPractice5;

import java.io.IOException;

public class Prob6_6 {

	public static void main(String[] args) throws IOException
	{
		for(int n = 1; n <= 9; n++) {
			kuku(n);
		}
	}
	
	static void kuku(int num) {
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf( " %2d", num * i );
		}
		System.out.println();
	}

}
