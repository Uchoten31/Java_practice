package javaPractice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob2_4 {
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        System.out.println("xの数値を入力してください");
        int x = Integer.parseInt(br.readLine());   // xの数値を入力する
        System.out.println("入力した数値x=" + x);
        System.out.println();
        System.out.println("yの数値を入力してください");
        int y = Integer.parseInt(br.readLine());	// yの数値を入力する
        System.out.println("入力した数値y=" + y);
        System.out.println();
        System.out.println("xとyの和" + (x + y));
        System.out.println("xとyの差" + (x - y));
        System.out.println("xとyの積" + (x * y));
        System.out.println("xとyの商と余り" + (x / y) + "..余り" + (x % y));
    }
}