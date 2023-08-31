package javaBasic1;

public class Q116 {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // sumメソッドの呼び出し
        System.out.println("配列の合計値：" + sum(arr));
    }
    // ここにsumメソッドを定義してください
	public static int sum(int[] arr) {
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
}
