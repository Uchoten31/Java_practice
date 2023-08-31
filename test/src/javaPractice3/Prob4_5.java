package javaPractice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob4_5 {

	public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
		
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println("整数を入力してください");
			int value = Integer.parseInt(br.readLine());
			sum += value;
		}
		System.out.println("入力した値の平均値：" + (sum / 10));
	}

}
