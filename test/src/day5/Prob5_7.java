package day5;

public class Prob5_7 {

	public static void main(String[] args) {
		
		String all = "";
		int sum = 0;
		int i;
		int data[] = new int[5];
		
		for(i = 0; i < data.length; i++) {
			int num = (int)(Math.random()*10)+1;
			data[i] = num;
			all += num + " ";
			sum += num;
		}
		int avg = sum / data.length;
		String avg_big = "";
		String avg_small = "";
		
		for(i = 0; i < data.length; i++) {
			if(data[i] > avg) {
				avg_big += data[i] + " ";
			}
			if(data[i] < avg) {
				avg_small += data[i] + " ";
			}
		}
		System.out.println(all);
		System.out.println();
		System.out.println("合計値：" + sum);
		System.out.println("平均値：" + avg);
		System.out.println();
		System.out.println("平均値より大きい数：" + avg_big);
		System.out.println("平均値より小さい数：" + avg_small);
	}
}
