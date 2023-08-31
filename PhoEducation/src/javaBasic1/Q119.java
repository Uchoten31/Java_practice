package javaBasic1;

public class Q119 {
	public static void main(String[] args) {
        // int2次元配列型変数arrの宣言と初期化
        int[][] arr = {{11, 22, 33}, {44}, {55, 66}, {77, 88, 99}};
        // 配列のすべての要素を順に表示してください
        for(int[] arr2 : arr) {
        	for(int value : arr2) {
        		System.out.print(value);
        	}
        }
        
        System.out.println();
        // 配列のすべての要素を逆から表示してください
        for(int i = arr.length - 1; i >= 0; i--) {
        	for(int j = arr[i].length - 1; j >= 0; j--) {
        		System.out.print(arr[i][j]);
        	}
        }
    }
}
