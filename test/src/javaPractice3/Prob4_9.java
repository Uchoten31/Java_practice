package javaPractice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob4_9 {

	public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
        		new InputStreamReader( System.in ));
		
        int max = 0;
        int min = 0;
        for(int i = 0; i < 10; i++) {
        	System.out.println("整数を入力してください");
        	int value = Integer.parseInt(br.readLine());
        	if(i == 0) {
        		max = value;
        		min = value;
        	} else {
        		if(max < value) {
        			max = value;
        		} 
        		if(min > value) {
        			min = value;
        		}
        	}
        }
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
	}

}
