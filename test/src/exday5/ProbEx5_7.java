package exday5;

import java.util.ArrayList;
import java.util.Collections;

public class ProbEx5_7 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		while(true) {
			int num = (int)(Math.random()*11);
			System.out.println("0～10の値を出力:" + num);
			if(num == 0) {
				break;
			}
			list.add(num);
			System.out.println();
			
			//	ArrayListの中身を小さい順に出力
			Collections.sort(list);
			System.out.print("出力された数：");		
			for(int i : list) {
				System.out.print(i + " ");
			}
			
			System.out.println();
			System.out.println();

		}
	}

}
