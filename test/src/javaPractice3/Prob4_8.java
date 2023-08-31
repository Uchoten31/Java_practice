package javaPractice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob4_8 {

	public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
        		new InputStreamReader( System.in ));
		
        int max = 0;
        for(int i = 0; i < 10; i++) {
        	System.out.println("自然数（正の整数）を入力してください");
        	int x = Integer.parseInt(br.readLine());
        	if(max < x) {
        		max = x;
        	}
        }
		System.out.println("最大値：" + max);
	}

}
