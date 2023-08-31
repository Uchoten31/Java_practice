package javaPractice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob3_5 {
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        System.out.println("正の整数値を入力してください");
        int x = Integer.parseInt(br.readLine());
        //	入力した値を表示
        System.out.println();
        System.out.println("入力した値：" + x);
        System.out.println();
        
        if(x %2 == 0) {
        	System.out.println("偶数です");
        } else {
        	System.out.println("奇数です");
        }
    }
}