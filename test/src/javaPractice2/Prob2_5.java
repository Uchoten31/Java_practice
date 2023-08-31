package javaPractice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob2_5 {
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        System.out.println("xの数値を入力してください");
        int x = Integer.parseInt(br.readLine());   // xの数値を入力する
        System.out.println("入力した数値x：" + x);
        System.out.println();
        System.out.println("yの数値を入力してください");
        int y = Integer.parseInt(br.readLine());	// yの数値を入力する
        System.out.println("入力した数値y：" + y);
        System.out.println();
        System.out.println("平均値：" + (x + y)/2);
    }
}