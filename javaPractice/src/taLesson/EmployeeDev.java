package taLesson;

public class EmployeeDev extends EmployeeBase {
	
	//	コンストラクタ
	public EmployeeDev() {
	}
	
	
	//	引数ありコンストラクタ
	public EmployeeDev(String emplouyeeName) {
		super.setEmployeeName(emplouyeeName);
		super.setDivisionName("開発部");
	}
	
}
