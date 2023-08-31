package practice8_seigyo;

//キーボード入力を使うための準備
import java.util.Scanner;

public class Q4 {
	
	public static void main(String[] args) {

		System.out.print("数値を入力してください:");
        //キーボードより数値を受け取ります。
        int n = (new Scanner(System.in)).nextInt();
        for (int i = 0; i < 8; i++) {
            //ここにプログラムを書きます。
        	for(int j = 0; j < n; j++) {
        		if(i %2 == 0) {
        			if(j %2 == 0) {
        				System.out.print("□");
        			} else {
        				System.out.print("■");
        			}
        		} else {
        			if(j %2 == 0) {
        				System.out.print("■");
        			} else {
        				System.out.print("□");
        			}
        		}
        	}
        	System.out.println();
        	
        }
    
	}
}
