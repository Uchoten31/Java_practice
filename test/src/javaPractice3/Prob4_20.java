package javaPractice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob4_20 {

	public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
        		new InputStreamReader( System.in ));
        
        System.out.println("数字を入力してください");
    	int x = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < x+1; i++) {
        	for(int y = 0; y < i; y++) {
        		System.out.print("$");
        	}
        	System.out.println();
        }
        
	}
}
