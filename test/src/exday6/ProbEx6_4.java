package exday6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class ProbEx6_4 {

	public static void main(String[] args)throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
		
        
        //	コンソールで英単語を入力
        System.out.print("英単語を入力:");
        String str = br.readLine();
        String[] param = str.split("");//入力値を分解する
        
        //	HashSetに登録
        HashSet<String> setStr = new HashSet<>();
        for(String s : param) {
        	setStr.add(s);
        }
        
        //	HashSetを表示
        System.out.print("使用されているアルファベット :");
        for(String hs : setStr) {
        	System.out.print(hs + " ");
        }
        
	}

}
