package javaPractice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise {
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        System.out.println("1行分の文字列を入力してください");
        String  s = br.readLine();    // 1行分の文字列を入力する
        System.out.println("入力した値：" + s);
    }
}