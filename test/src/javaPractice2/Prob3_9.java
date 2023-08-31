package javaPractice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob3_9 {
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        System.out.println("曜日を選択してください");
        System.out.println(">0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
        int day = Integer.parseInt(br.readLine());
        System.out.println("時間帯を選択してください");
        System.out.println(">0=午前、1=午後、2=夜間");
        int zone = Integer.parseInt(br.readLine());
        System.out.println();
        
        //	開いているか、休診であるかを判断する
        if(day == 0 || (day == 2 && zone == 0) || (day == 3 && zone == 2) || (day == 5 && zone == 0) || (day == 6 && zone >= 1)) {
        	System.out.println("休診です");
        } else {
        	System.out.println("開いています");
        }
        
    }
}