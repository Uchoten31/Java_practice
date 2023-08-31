package javaPractice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob3_13 {
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        System.out.println("月を表す数値を入力してください");
        int month = Integer.parseInt(br.readLine());
        System.out.println();
        System.out.print(month + "月");
        
        switch(month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        	System.out.println("は、31日あります");
        	break;
        case 4:
        case 6:
        case 9:
        case 11:
        	System.out.println("は、30日あります");
        	break;
        case 2:
        	System.out.println("は、28日あります");
        	break;
        default:
        	System.out.println("：入力が間違っています");
        	break;
        }
    }
}