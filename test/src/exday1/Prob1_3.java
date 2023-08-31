package exday1;

public class Prob1_3 {

	public static void main(String[] args) {
		int m = (int)(Math.random()*10)+1;		//	縦の値に乱数を代入
		int n = (int)(Math.random()*10)+1;		//　横の値に乱数を代入
		
		System.out.println("たて：" + m);
		System.out.println("よこ：" + n);
		System.out.println();
		square(m,n);
		
	}
	//	縦、横に指定された数の■マークを表示する。ただし、どちらかの値が0以下の場合は、何も表示しない。
	static void square(int m,int n) {
		int i;
		int y;
		for(i = 0; i < m; i++) {
			for(y = 0; y < n; y++) {
				System.out.print("■");
			}
			System.out.println();
		}
		
	}
}
