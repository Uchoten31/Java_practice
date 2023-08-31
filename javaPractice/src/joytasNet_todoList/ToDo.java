package joytasNet_todoList;

public class ToDo {
	// ToDoの内容
	private String title;
	// ToDoの重要度
	private int importance;
	
	// コンストラクタ
	public ToDo(String title, int importance) {
		this.title = title;
		this.importance = importance;
	}
	
	// 重要度を受け取るゲッター
	public int getImportance() {
		return importance;
	}
	
	// ToDoインスタンスの情報をreturnするメソッド
	public String showStatus() {
		return String.format("%s/重要度:%d", this.title, this.importance);
	}
	
	// 重要度を変更するメソッド
	public void changeImportance(int importance) {
		this.importance = importance;
		System.out.println("重要度を変更しました。");
	}
	
	// インスタンスの情報をcsvで出力する
	public String toCSV() {
		return String.format("%s,%d", this.title, this.importance);
	}

}
