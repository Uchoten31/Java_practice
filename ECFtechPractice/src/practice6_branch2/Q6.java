package practice6_branch2;

public class Q6 {
	
	public static void main(String[] args) {

		int a = 6;
        int b = 4;
        int c = 2;
        //ここからプログラムを追加します。
        int max = a;
        
        if(a < b) {
        	if(b < c) {
        		System.out.println("cが最大です。");
        	} else {
        		System.out.println("bが最大です。");
        	}
        } else {
        	if(a < c) {
        		System.out.println("cが最大です。");
        	} else {
        		System.out.println("aが最大です。");
        	}
        }
    
	}
}
