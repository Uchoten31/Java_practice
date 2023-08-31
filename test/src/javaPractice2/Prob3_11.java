package javaPractice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob3_11 {
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        System.out.println("月を表す数字を入力してください");
        int month = Integer.parseInt(br.readLine());
        
        System.out.println("入力した月：" + month + "月");
        
        switch(month) {
        case 1:
        	System.out.println("１月：元日、成人の日");
        case 2:
        	System.out.println("２月：建国記念の日");
        case 3:
        	System.out.println("３月：春分の日");
        case 4:
        	System.out.println("４月：昭和の日");
        case 5:
        	System.out.println("５月：憲法記念日、みどりの日、こどもの日");
        case 6:
        case 7:
        	System.out.println("７月：海の日");
        case 8:
        case 9:
        	System.out.println("９月：敬老の日、秋分の日");
        case 10:
        	System.out.println("１０月：体育の日");
        case 11:
        	System.out.println("１１月：文化の日、勤労感謝の日");
        case 12:
        	System.out.println("１２月：天皇誕生日");
        }
    }
}