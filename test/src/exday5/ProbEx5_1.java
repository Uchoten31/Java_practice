package exday5;

import java.util.ArrayList;

public class ProbEx5_1 {

	public static void main(String[] args) {

		ArrayList<Integer> evens = new ArrayList<>();
		ArrayList<Integer> odds = new ArrayList<>();
		while(true){
			int num = (int)(Math.random()*11);
			System.out.println("0～10の値を出力:" + num);
			if(num == 0) {
				break;
			} else if(num %2 == 0){
				evens.add(num);
			} else {
				odds.add(num);
			}

		}
		System.out.println();
		
		System.out.println("偶数：" + evens);
		System.out.println("奇数：" + odds);
		
		
	}

}
