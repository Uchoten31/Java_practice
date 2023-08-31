package algorithmPractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 入力パラメータを読み込む
		System.out.println("入力してください");
        String input = br.readLine();
        String[] param = input.split(" ");//入力値を空白で分解する
        /**
         * ここに回答を記述する
        **/

        int num1 = Integer.parseInt(param[0]);
        String type = param[1];
        int num2 = Integer.parseInt(param[2]);
        
		if(type.equals("+")){
			System.out.println(num1 + num2);
		} else if(type.equals("-")) {
			System.out.println(num1 - num2);
		} else if(type.equals("*")) {
			System.out.println(num1 * num2);
		} else if(type.equals("/")) {
			System.out.println((num1 / num2) + " ... " + (num1 % num2) );
		} 


	}

}
