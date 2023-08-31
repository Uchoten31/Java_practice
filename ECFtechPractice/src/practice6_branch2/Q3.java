package practice6_branch2;

import java.util.Scanner;

public class Q3 {
	
	public static void main(String[] args) {

		System.out.print("合言葉は？:");
        //キーボードからの文字列の入力を待ちます。
        String str = (new Scanner(System.in)).nextLine();
        if (str.equals("hello")) {
            System.out.println("おはいりください");
        }
        else {
            System.out.println("合言葉が違います");
        }
    
	}
}
