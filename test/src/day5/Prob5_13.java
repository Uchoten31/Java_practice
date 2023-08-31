
package day5;

public class Prob5_13 {

	public static void main(String[] args) {
		
		int a[][] = new int[3][3];
		int m,n;
		int max = 0;
		int min = 10;
		for(m = 0; m < a.length; m++) {
			for(n = 0; n < a[m].length; n++) {
				int num = (int)(Math.random()*10);
				a[m][n] = num;
				if(max < num) {
					max = num;
				}
				if(min > num) {
					min = num;
				}
			}
		}
		for(m = 0; m < a.length; m++) {
			for(n = 0; n < a[m].length; n++) {
				System.out.print(a[m][n] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
	}
}
