package taLesson;

public class EmployeeBase {

	//	フィールド
	private String employeeName; 	//	社員名
	private String divisionName;	//	部署名
	
	
	//	コンストラクタ
	public EmployeeBase() {
	}
	
	
	//	引数ありコンストラクタ
	public EmployeeBase(String employeeName, String divisionName) {
		this.employeeName = employeeName;
		this.divisionName = divisionName;
	}
	
	
	//	自己紹介メソッド
	public void introduce() {
		System.out.println("私の名前は" + employeeName + "です。");
		System.out.println("所属部署は" + divisionName + "です。");
	}

	
	
	//	getter setter
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getDivisionName() {
		return divisionName;
	}
	
	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}
	
	
}
