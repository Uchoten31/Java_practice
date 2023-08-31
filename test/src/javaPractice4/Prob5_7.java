package javaPractice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob5_7 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ));
		
		int kuku[][] = new int[9][];
		
		int i;
		int j;

		// 配列 kuku に値を代入する
		for( i = 0 ; i < 9 ; i++ ) 
		{
			kuku[i] = new int[9];
			
			for( j = 0; j < 9; j++) {
				kuku[i][j] = (i + 1) * (j + 1);
			}
		}
		
		for( i = 0 ; i < 9 ; i++ )
		{
		    for( j = 0 ; j < 9 ; j++ ) {
//		        System.out.printf( " %2d", kuku[i][j] );
		    }
		}
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		i = x;
		j = y;
		
		System.out.printf( " %2d", kuku[i][j] );
		
	}

}
