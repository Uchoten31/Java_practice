package javaPractice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob5_5 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ));
		
		int value = Integer.parseInt( br.readLine() );

		int binary[] = new int[16];

		// 配列 binaryに0か1を代入する
		
		for(int i = 15; i >= 0; i--, value /= 2) {
			binary[i] = value % 2;
		}

		for( int i = 0 ; i < 16 ; i++ )
		    System.out.print( binary[i] );
	}

}
