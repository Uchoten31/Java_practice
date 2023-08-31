package exday6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ProbEx6_1 {

	public static void main(String[] args)throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
		
        //	英語と日本語の対応をつくる
        HashMap<String, String> map = new HashMap<>();
        map.put("cat", "猫");
        map.put("dog", "犬");
        map.put("bird", "鳥");
        map.put("tiger", "トラ");
        
        //	コンソールで入力してもらう
        System.out.print("英語で動物の名前を入力してください：");
        String animal = br.readLine();
        
        System.out.println();
        
        //	対応する日本語を表示
        if(map.containsKey(animal)) {
        	System.out.println("「" + map.get(animal) + "」です。");
        } else {
        	System.out.println("対応するデータは登録されていません。");
        }
        
        
	}

}
