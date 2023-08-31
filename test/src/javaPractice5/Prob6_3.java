package javaPractice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob6_3 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ) );
				
		System.out.println("xの数値を入力");
		int x = Integer.parseInt(br.readLine());
		System.out.println("yの数値を入力");
		int y = Integer.parseInt(br.readLine());
		System.out.println("zの数値を入力");
		int z = Integer.parseInt(br.readLine());
		
		System.out.println("最も大きい数字は" + maxValue( x, maxValue(y, z) ) );
			
		
		
		
	}
	
	static int maxValue(int a, int b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}

}
