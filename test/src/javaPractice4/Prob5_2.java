package javaPractice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob5_2 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ));
		
		int value[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.println("数値を入力してください");
			value[i] = Integer.parseInt(br.readLine());
			
		}
		
		System.out.println();
		
		for(int i = 9; i >= 0; i--) {
			
			System.out.println(value[i] * 2);
			
		}
		
	}

}
