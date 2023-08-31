package algorithmPractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q4 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 入力パラメータを読み込む
        String input = br.readLine();
        String[] param = input.split(" ");//入力値を空白で分解する
        /**
         * ここに回答を記述する
        **/

		int sum = calc(param, 0, param.length - 1);
		System.out.println(sum);

	}
	
	
	public static int calc(String[] param, int startIdx, int endIdx) {
		int sum = 0;
		String type = null;
		for(int i = startIdx; i < endIdx + 1; i++) {
			
			if(param[i].equals("+") || param[i].equals("-")) {
				type = param[i];
				
			} else if(param[i].equals("(")) {
				// 「(」の終端を見つけるためにcheckEndOfFormula()メソッドを利用する。
				int endOffFormula = checkEndOffFormula(param,i);
				if(type != null) {
					if(type.equals("+")) {
						// calc()メソッドを、再帰的に呼び出す。
						sum += calc(param, i + 1, endOffFormula -1);
					} else if(type.equals("-")) {
						// calc()メソッドを、再帰的に呼び出す。
						sum -= calc(param, i + 1, endOffFormula -1);
					}
				} else {
					sum = calc(param, i + 1, endOffFormula -1);
				}
				i = endOffFormula;
			} else {
				int num = Integer.parseInt(param[i]);
				if(type != null) {
					if(type.equals("+")) {
						sum += num;
					} else if(type.equals("-")) {
						sum -= num;
					}
				} else {
					sum = num;
				}
			}
		}
		return sum;
	}
	
	
	//	かっこ「 ) 」の終わりを見つける
	public static int checkEndOffFormula(String[] param, int startIdx) {
		int end = startIdx + 1;
		int startCount = 0;
		for(int i = startIdx + 1; i < param.length; i++) {
			end = i;
			if(param[i].equals("(")) {
				// 途中に現れた「（」の数をカウント
				startCount++;
			} else if(param[i].equals(")")) {
				if(startCount == 0) {
					break;
				} else {
					// 「」」が現れると減算
					startCount--;
				}
			}
		}
		return end;
	}

}
