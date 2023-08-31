package practice5_branch;

public class Q5 {
	
	public static void main(String[] args) {

		//0～9までのランダムな値をaに代入してくれる命令です。
        int a = new java.util.Random().nextInt(10);
        System.out.println("a = " + a);
        //ここからプログラムを書いていきます。
        if(a %2 == 0) {
        	System.out.println("aは偶数です");
        } else {
        	System.out.println("aは奇数です");
        }
    
	}
}
