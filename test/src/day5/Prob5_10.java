
package day5;

public class Prob5_10 {

	public static void main(String[] args) {
		
		String all = "";
		int i;
		int data[] = new int[7];
		
		for(i = 0; i < data.length; i++) {
			int num = (int)(Math.random()*10)+1;
			data[i] = num;
			all += num + " ";
			
		}
		System.out.println(all);
		System.out.println();
		int n;
		for(i = 0; i < data.length; i++) {
			for(n = 0; n < data[i]; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
