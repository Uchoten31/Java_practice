package practice13_colection;

import java.util.HashMap;
import java.util.Map;

public class Q3 {
	public static void main(String[] args) {
        //HashMapインスタンスを生成
		Map<String, Integer> map = new HashMap<String, Integer>();
        //各科目の科目名と得点を要素として追加
		map.put("国語", 90);
		map.put("数学", 80);
		map.put("英語", 70);

        //HashMapからkeySetを取り出し、拡張forで各科目の
        //科目名と得点を表示する。
		for(String key : map.keySet()) {
		System.out.println(key + ":" + map.get(key));
		}

    }
}
