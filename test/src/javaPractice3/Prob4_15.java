package javaPractice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob4_15 {

	public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
        		new InputStreamReader( System.in ));
        
        System.out.println("数字を入力してください");
        int value = Integer.parseInt(br.readLine());
        
        if(value < 2) {
        	System.out.println("素数ではありません");
        }
        
        for(int i = 2; i < value; i++) {
        	if(value % i == 0) {
        		System.out.println("素数ではありません");
        		return;
        	}
        }
        
        
        System.out.println("素数です");
        
        
//        
//
//        for(int i = 2 ; i <= ( value / 2 ) ; i++ ){
//            if( ( value % i ) == 0 )
//                break;
//        }
//
//        if( i > ( value / 2 ) )
//            System.out.println( value + "は素数です" );
//        else
//            System.out.println( value + "は素数ではありません" );
      
	}

}
