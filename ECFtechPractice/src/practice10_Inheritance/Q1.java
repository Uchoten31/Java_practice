package practice10_Inheritance;

public class Q1 {

	public static void main(String[] args) {

		Employee taro = new Employee();
        taro.name = "タロウ";

        Manager hanako = new Manager();
        hanako.name = "ハナコ";

        //①taroの持つoperationメソッドを呼び出します。
        taro.operation();
        //②hanakoの持つoperationメソッドを呼び出します。
        hanako.operation();
        //③hanakoの持つmanagementメソッドを呼び出します。
		hanako.management();
        
	}

}
