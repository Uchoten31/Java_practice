package practice13_colection;

import java.util.ArrayList;
import java.util.List;

public class Q1 {

	public static void main(String[] args) {
		//ArrayListインスタンスを生成します。
		List<String> list = new ArrayList<String>();
		//4つの要素を追加。addメソッドを使用します。
		list.add("りんご");
		list.add("みかん");
		list.add("バナナ");
		list.add("ぶどう");
		//拡張for文で各要素を表示します。
		for(String s : list) {
			System.out.println(s);
		}
	}

}
