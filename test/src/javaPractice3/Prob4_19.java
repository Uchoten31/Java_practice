package javaPractice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob4_19 {

	public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
        		new InputStreamReader( System.in ));
        
        int sum = 0;
        int count = 0;
        for( ; ; ) {
        	System.out.println("数字を入力してください");
        	int x = Integer.parseInt(br.readLine());
        	if(x == 0) {
        		break;
        	}
        	
        	sum += x;
        	count++;
        }
        
        System.out.println("平均値；" + (sum/count));
        
        
        
        
	}
}
