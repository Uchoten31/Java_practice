package algorithmPractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q3 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 入力パラメータを読み込む
		System.out.println("入力してください");
        String input = br.readLine();
        String[] param = input.split(" ");//入力値を空白で分解する
        /**
         * ここに回答を記述する
        **/

        
        String type = null;
        int sum = 0;
		for(int i = 0; i < param.length; i++) {	// ①：入力パラメータを順に処理する。
			if(param[i].equals("+") || param[i].equals("-")) {	// ②：入力パラメータが演算記号の場合、演算記号を変数に格納する。
				type = param[i];
			} else {
				Integer num = Integer.parseInt(param[i]);	// ③：入力パラメータが演算記号でない場合、数値に変換する。
				if(type != null) {	// ④：上記③で演算記号が格納されている場合、これまでの合計値と、その演算記号に応じた演算を行い、合計値として設定する。
					if(type.equals("+")) {
						sum += num;
					} else if(type.equals("-")) {
						sum -= num;
					}
				} else {
					sum = num;	// ⑤：上記③で演算記号が格納されていない場合（＝先頭の数字の場合）、その値を合計値として設定する。
				}
			}
		}
		System.out.println(sum);

	}

}
