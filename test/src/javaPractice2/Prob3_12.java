package javaPractice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob3_12 {
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        System.out.println("好きな鮨（すし）を選択してください");
        System.out.println("1：まぐろ　2：えび　3：こはだ");
        int x = Integer.parseInt(br.readLine());
        
        switch(x) {
        case 1:
        	System.out.println("いいよね。まぐろっていいよね。");
        	break;
        case 2:
        	System.out.println("スシローってえび系の種類豊富だよね。");
        	break;
        case 3:
        	System.out.println("こはだって何？");
        	break;
        default:
        	System.out.println("選択肢にないもの選ぶなし");
        	break;
        }
    }
}