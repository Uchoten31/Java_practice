package javaPractice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob4_16 {

	public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
        		new InputStreamReader( System.in ));
        
        System.out.println("2以上の数字を入力してください");
        int value = Integer.parseInt(br.readLine());
        
        //	素因数分解
        //	valueが1以下のときに抜けるループ
        while(value > 1) {
        	//	valueを2から順番に割っていく
        	for(int i = 2; i <= value; i++) {
        		if(value %i == 0) {
        			//	valueが割り切れたときの処理
        			System.out.print(i + " ");
        			value = value / i;
        			//	valueが再度iで割り切れる可能性があるのでfor分を抜ける
        			break;
        		}
        	}
        }
        
//        for( int x = 2 ; n > 1 ; x++ ){
//            while( ( n % x ) == 0 ){
//                System.out.print( x + " " );
//                n /= x;
//            }
//        }
        
	}
}
