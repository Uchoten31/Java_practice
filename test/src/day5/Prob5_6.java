package day5;

public class Prob5_6 {

	public static void main(String[] args) {
		
		String all = "";
		int max = 0;
		int min = 10;
		int sum = 0;
		int i;
		int data[] = new int[10];
		
		for(i = 0; i < data.length; i++) {
			int num = (int)(Math.random()*10)+1;
			data[i] = num;
			all += num + " ";
			sum += num;
			if(max < num) {
				max = num;
			}
			if(min > num) {
				min = num;
			}
		}
		
		System.out.println(all);
		System.out.println();
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
		System.out.println("平均値：" + sum/10);
	}
}
