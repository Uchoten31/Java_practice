package javaPractice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob3_8 {
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        System.out.println("中間試験の点数（0～100点）を入力してください");
        int x = Integer.parseInt(br.readLine());
        System.out.println("期末試験の点数（0～100点）を入力してください");
        int y = Integer.parseInt(br.readLine());
        //	入力した値を表示
        System.out.println();
        System.out.println("中間試験の点数：" + x);
        System.out.println("期末試験の点数：" + y);
        
        
        //	合否を判定
        if(x >= 60 && y >= 60) {
        	System.out.println("合格です");
        } else if((x + y) >= 130) {
        	System.out.println("合格です");
        } else if((x + y) >= 100 && (x >= 90 || y >= 90)) {
        	System.out.println("合格です");
        } else {
        	System.out.println("不合格です");
        }
        
    }
}