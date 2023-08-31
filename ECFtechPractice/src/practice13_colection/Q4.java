package practice13_colection;

public class Q4 {

	public static void main(String[] args) {

		MenuManager manager = new MenuManager();
        //サンドイッチメニューの表示
        manager.showMenu("sandwitch");
        //サンドイッチメニューにビッグバーガーを追加
        manager.setMenu("sandwitch","ビッグバーガー");
        //サンドイッチメニューの表示
        manager.showMenu("sandwitch");
        //「ホットミルク」をメニューから検索
        manager.searchMenu("ホットミルク");
        //「オレンジジュース」をメニューから検索
        manager.searchMenu("オレンジジュース");
 
	}

}
