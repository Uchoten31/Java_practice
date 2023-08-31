package javaBasic1;

public class Q114 {
	public static void main(String[] args) {
        int x = 6;
        int y = 79;
        int z = 54;
        // minメソッドの呼び出し
        System.out.println("整数" + x + "、" + y + "、" + z + "の中で最小の値は");
        System.out.println(min(x, y, z) + "です");
    }
    // ここにminメソッドを定義してください
	public static int min(int x, int y, int z) {
		int min = x;
		if(min > y) {
			min = y;
		} if(min > z) {
			min = z;
		}
		return min;
	}
}
