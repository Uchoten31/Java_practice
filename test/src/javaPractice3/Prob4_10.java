package javaPractice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob4_10 {

	public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
        		new InputStreamReader( System.in ));
	
        System.out.println("個数を入力してください");
        int value = Integer.parseInt(br.readLine());
        for(int i = 0; i < value; i++) {
        	System.out.print("*");
        }
	}

}
