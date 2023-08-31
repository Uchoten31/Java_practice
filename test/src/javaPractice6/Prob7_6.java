package javaPractice6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob7_6 {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );
		
		
		CoinCase myCase = new CoinCase();
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("硬貨の種類は何ですか？");
			System.out.println("500, 100, 50, 10, 5, 1");
			int kind = Integer.parseInt(br.readLine());
			
			System.out.println("何枚ですか？");
			int count = Integer.parseInt(br.readLine());
			
			myCase.AddCoins(kind, count);
		}
		
//		System.out.println( "500円は" + myCase.GetCount( 500 )
//        		+ "枚、" + myCase.GetAmount( 500 ) + "円" );
//		System.out.println( "100円は" + myCase.GetCount( 100 )
//				+ "枚、" + myCase.GetAmount( 100 ) + "円" );
//		System.out.println( "50円は" + myCase.GetCount( 50 )
//				+ "枚、" + myCase.GetAmount( 50 ) + "円" );
//		System.out.println( "10円は" + myCase.GetCount( 10 )
//				+ "枚、" + myCase.GetAmount( 10 ) + "円" );
//		System.out.println( "5円は" + myCase.GetCount( 5 )
//				+ "枚、" + myCase.GetAmount( 5 ) + "円" );
//		System.out.println( "1円は" + myCase.GetCount( 1 )
//        		+ "枚、" + myCase.GetAmount( 1 ) + "円" );
//		System.out.println( "全部で" + myCase.GetCount() + "枚" );
//		System.out.println( "総額は" + myCase.GetAmount() + "円" );
		
		
		
		
		
	}

}