package javaPractice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob2_2 {
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        System.out.println("数値を入力してください");
        int x = Integer.parseInt( br.readLine() );    // 数値を入力する
        System.out.println("入力した値：" + x);
    }
}