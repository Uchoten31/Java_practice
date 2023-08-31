package javaPractice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob4_11 {

	public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
        		new InputStreamReader( System.in ));
        
//        int x = 0;
//        System.out.println("個数を入力してください");
//        int value = Integer.parseInt(br.readLine());
//        for(int i = 0; i < value; i++) {
//        	if(x <= 9) {
//            	System.out.print(x);
//            	x++;
//        	} else {
//        		x = 0;
//            	System.out.print(x);
//            	x++;
//        	}
//        	
//        }
        int count = Integer.parseInt( br.readLine() );

        for( int i = 0, out = 0 ; i < count ; i++ )
        {
            System.out.print( out++ );

            if( out > 9 )
                out = 0;
        }
        
	}

}
