package practice8_seigyo;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		System.out.print("数値を入力してください：");
		//キーボードからの入力を受けとり、nに入れる
        int n = (new Scanner(System.in)).nextInt();
        //ここからプログラムを記述します。
        
        int result = 0;
		for(int i = 1; i <= n; i++) {
			if(i == 1) {
				result = i;
			} else {
				result *= i;
			}
		}
		System.out.print(n + "! = " + result);
        
	}

}
