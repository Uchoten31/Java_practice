package exday6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ProbEx6_2 {

	public static void main(String[] args)throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
		
        //	数字と漢数字の対応をつくる
        HashMap<String, String> map = new HashMap<>();
        map.put(",", ",");
        map.put("0", "〇");
        map.put("1", "一");
        map.put("2", "二");
        map.put("3", "三");
        map.put("4", "四");
        map.put("5", "五");
        map.put("6", "六");
        map.put("7", "七");
        map.put("8", "八");
        map.put("9", "九");
        
        //	コンソールで整数を入力してもらう
        System.out.print("整数の値を入力してください:");
        String num = br.readLine();
        String[] param1 = num.split("");
        System.out.println();
        
        
        // 入力値が整数であるかどうかを判定
        if (!num.matches("\\d+")) {
        	System.out.println("整数の値を入力してください。");
        	return;
        }
                
        // 入力値を3桁区切りのカンマに変換
        String num2 = String.format("%,d", Integer.parseInt(num));
        
        //	入力値を分解する
        String[] param2 = num2.split("");
        
        //	漢数字に変換して表示
        for(String s : param2) {
        	System.out.print(map.get(s));
        }
        
    
        
	}

}
