package javaOOP1;

public class Q201 {
	public static void main(String[] args) {
        // Employeeクラスのオブジェクトを作成
        Employee employee = new Employee();
        // Employeeオブジェクトに社員番号と社員名をセット
        employee.setData(1234, "山田");
        // Employeeオブジェクトの社員番号を出力
        System.out.println("社員番号：" + employee.getId());
        // Employeeオブジェクトの社員名を出力
        System.out.println("社員名：" + employee.getName());
    }
}
// ここにEmployeeクラスを作成してください。
class Employee {
	private int id;
	private String name;
	
	public void setData(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}
