
package day5;

public class Prob5_12 {

	public static void main(String[] args) {
		
		int a[][] = new int[3][3];
		int m,n;
		for(m = 0; m < a.length; m++) {
			for(n = 0; n < a[m].length; n++) {
				a[m][n] = (int)(Math.random()*10);
			}
		}
		for(m = 0; m < a.length; m++) {
			for(n = 0; n < a[m].length; n++) {
				System.out.print(a[m][n] + " ");
			}
			System.out.println();
		}
	}
}
