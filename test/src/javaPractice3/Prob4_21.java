package javaPractice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob4_21 {

	public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
        		new InputStreamReader( System.in ));
        
        System.out.println("数字を入力してください");
    	int size = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < size; i++) {
        	for(int j = 0; j < size; j++) {
        		if(i == j || ( size - i - 1) == j) {
        			System.out.print("X");
        		} else {
        			System.out.print(" ");
        		}
        	}
        	System.out.println();
        }
        
	}
}
