package javaPractice5;

import java.io.IOException;

public class Prob6_5 {

	public static void main(String[] args) throws IOException
	{
		triangle(3, '%');
		System.out.println();
		triangle(6, '&');
		System.out.println();
		triangle(2, '#');
		System.out.println();
		
		
		
	}
	
	static void triangle(int size, char ch) {
		for(int i = 0; i < size; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
