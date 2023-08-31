package javaPractice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob4_18 {

	public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
        		new InputStreamReader( System.in ));
        
        int sum = 0;
//        do {
//        	System.out.println("数字を入力してください");
//        	int x = Integer.parseInt(br.readLine());
//        	sum += x;
//        } while(x != 0);
        
        for( ; ; ) {
        	System.out.println("数字を入力してください");
        	int x = Integer.parseInt(br.readLine());
        	if(x == 0) {
        		break;
        	}
        	
        	sum += x;
        }
        
        System.out.println("合計；" + sum);
        
        
        
        
	}
}
