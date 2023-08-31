package javaPractice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob3_3 {
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        System.out.println("xの値を入力してください");
        int x = Integer.parseInt(br.readLine());
        System.out.println("yの値を入力してください");
        int y = Integer.parseInt(br.readLine());
        //	入力した値を表示
        System.out.println();
        System.out.println("x：" + x + " y：" + y);
        System.out.println();
        
        if(x > y) {
        	System.out.println("xはyより大きい");
        } else {
        	System.out.println("xはyより小さい");
        }
    }
}