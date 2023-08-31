package javaPractice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob4_7 {
	
	public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
        		new InputStreamReader( System.in ));
		
        int jTotal = 0;
        int tTotal = 0;
        
		for(int i = 1; i < 10; i++) {
			System.out.print(i + " 回表、巨人の得点は？");
			int j = Integer.parseInt(br.readLine());
			jTotal += j;
			System.out.print(i + " 回裏、阪神の得点は？");
			int t = Integer.parseInt(br.readLine());
			tTotal += t;
			
		}
		System.out.println("巨人：" + jTotal + "点, 阪神：" + tTotal + "点");
		if(jTotal > tTotal) {
			System.out.println("巨人の勝ち" );
		} else {
			System.out.println("阪神の勝ち" );
		}
		
	}

}
