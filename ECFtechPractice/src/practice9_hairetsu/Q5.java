package practice9_hairetsu;

public class Q5 {
	
	public static void main(String[] args) {

		int[] score = { 45, 90, 75, 60, 80 };
        int[] rank = { 1, 4, 2, 3, 0 };

        System.out.println("----- 出席番号順 -----");
        //出席番号順の表示
        for (int i = 0; i < score.length; i++) {
            //ここにプログラムを書きます
        	System.out.println((i + 1) + "番：" + score[i] + "点");
        }
        System.out.println("----- 得点順 -----");        
        //得点の高い順に表示
        for (int i = 0; i < score.length; i++){
            //ここにプログラムを書きます
        	System.out.println((i + 1) + "位：" + score[rank[i]] + "点");
        }
    
	}
}
