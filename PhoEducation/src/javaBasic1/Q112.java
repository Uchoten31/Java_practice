package javaBasic1;

public class Q112 {
	public static void main(String[] args) {
        // displayメソッドの呼び出し
        display("テスト", 7);
    }
    // ここにdisplayメソッドを定義してください
	public static void display(String str, int num) {
		for(int i = 0; i < num; i++) {
			System.out.println(str);
		}
	}
}
