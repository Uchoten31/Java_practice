package practice8_seigyo;

public class Q2 {
	
	public static void main(String[] args) {

		int a = 2;
        int b = 8;
        //ここにプログラムを書きます。
        int result = 1;
        for(int i = 0; i < b; i++) {
        	result *= a;
        }
        System.out.println(a + "の" + b + "乗は" + result + "です");
    
	}
}
