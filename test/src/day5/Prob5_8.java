
package day5;

public class Prob5_8 {

	public static void main(String[] args) {
		
		String all = "";
		int i;
		int count_p = 0;	// 正の整数の個数を数える
		int count_m = 0;	// 負の整数の個数を数える
		int count_z = 0;	// 0の個数を数える
		int data[] = new int[5];
		
		for(i = 0; i < data.length; i++) {
			int num = (int)(Math.random()*21)-10;
			data[i] = num;
			all += num + " ";
		}
		for(i = 0; i < data.length; i++) {
			if(data[i] > 0) {
				count_p++;
			}
			if(data[i] < 0) {
				count_m++;
			}
			if(data[i] == 0) {
				count_z++;
			}
		}
		System.out.println(all);
		System.out.println();
		System.out.println("0より大きい数：" + count_p + "個");
		System.out.println("0より小さい数：" + count_m + "個");
		System.out.println("0の個数：" + count_z + "個");
	}
}
