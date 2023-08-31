package javaPractice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob5_4 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ));
		
		int sum = 0;
		int value[] = new int[10];
		int cnt = 0;

		for(int i = 0; i < 10; i++) {
			System.out.println("数値を入力してください");
			value[i] = Integer.parseInt(br.readLine());
			sum += value[i];
			cnt++;
			
			if(sum >= 100) {
				break;
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < cnt; i++) {
			System.out.println(value[i]);
		}
		
	}

}
