package javaPractice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob5_3 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ));
		
		int values[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.println("数値を入力してください");
			values[i] = Integer.parseInt(br.readLine());
		
		}
		System.out.print("\n偶数：");
		
		for(int n : values) {
			if((n % 2) == 0) {
				System.out.print(n + " ");
			}
		}
		System.out.print("\n奇数：");
		
		for(int n : values) {
			if((n % 2) != 0) {
				System.out.print(n + " ");
			}
		}
		
	}

}
