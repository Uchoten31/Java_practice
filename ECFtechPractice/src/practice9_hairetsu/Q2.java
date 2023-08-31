package practice9_hairetsu;

public class Q2 {
	
	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };
        //ここにプログラムを書きます。
		for(int i = 0; i < array.length; i++) {
			array[i] *= 2;
		}

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    
	}
}
