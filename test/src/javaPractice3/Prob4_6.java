package javaPractice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob4_6 {

	public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
        		new InputStreamReader( System.in ));
		
		int win = 0;
		int lose = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println("0か1を入力してください");
			int judge = Integer.parseInt(br.readLine());
			if(judge == 0) {
				lose++;
			} else if(judge == 1) {
				win++;
			}
		}
		System.out.println("勝ちの総数：" + win);
		System.out.println("負けの総数：" + lose);
	}

}
