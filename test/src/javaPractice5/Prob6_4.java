package javaPractice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob6_4 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ) );
				
		triangle(3);
		System.out.println();
		triangle(4);
		System.out.println();
		triangle(5);
		System.out.println();
		
			
		
		
		
	}
	
	static void triangle(int size) {		//	voidなので戻り値がない＝returnがいらない？
		for(int i = 0; i < size; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("%");
			}
			System.out.println();
		}
	}

}
