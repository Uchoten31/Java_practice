package javaPractice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob3_10 {
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        System.out.println("整数値xを入力してください");
        int x = Integer.parseInt(br.readLine());
        System.out.println("整数値yを入力してください");
        int y = Integer.parseInt(br.readLine());
        System.out.println();
        
        if(x < y && (x %2 == 0 && y %2 == 0)) {
        	System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。" );
        }
        if(x == y && x < 0) {
        	System.out.println( "xとyは等しく、かつ、負の数である。" );
        }
        if(x < y || (x %2 == 0)) {
        	System.out.println( "xはyより小さい、または、xは偶数である。" );
        }
        if((x <= 10 || x >= 100) && (y >= 10 && y <= 100)) {
        	System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。" );
        }
        if(!(x < 0 && y < 0)) {
        	System.out.println( "xもyも負の数である、ではない。" );
        }
    }
}