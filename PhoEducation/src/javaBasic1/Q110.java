package javaBasic1;

public class Q110 {

	public static void main(String[] args) {
		
		// 山の段数を表す変数
        int level = 7;
        // for文の開始
        for(int i = 0; i < level; i++) {
        	for(int j = 0; j < level + i; j++) {
        		if(j < level - i -1) {
        			System.out.print("□");
        		} else {
        			System.out.print("■");
        		}
        	} 
        	System.out.println();
        }
		
	}

}
