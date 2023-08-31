package javaPractice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob2_6 {
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        System.out.println("あなたの年齢を入力してください");
        int x = Integer.parseInt(br.readLine());   // 数値を入力する
        System.out.println();
        System.out.println("あなたの年齢：" + x);
        System.out.println("生まれてからのおおよその日数：" + (x * 365) + "日です");
    }
}