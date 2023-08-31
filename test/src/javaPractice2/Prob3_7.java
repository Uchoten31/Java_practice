package javaPractice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob3_7 {
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        System.out.println("試験の点数を入力してください");
        int x = Integer.parseInt(br.readLine());
        //	入力した値を表示
        System.out.println();
        
        //	ケース1
        if(x >= 60) {
        	System.out.println("合格");
        } else {
        	System.out.println("不合格");
        }
        
        //	ケース2
        if(x >= 80) {
        	System.out.println("たいへんよくできました。");
        } else if(x >= 60) {
        	System.out.println("よくできました。");
        } else {
        	System.out.println("ざんねんでした。");
        }
        
        //	ケース3
        if(x >= 60) {
        	if(x >= 80) {
        		System.out.println("優");
        	} else if(x >= 70) {
        		System.out.println("良");
        	} else {
        		System.out.println("可");
        	}
        } else {
        	System.out.println("不可");
        }
        
    }
}