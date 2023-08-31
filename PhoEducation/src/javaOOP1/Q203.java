package javaOOP1;

public class Q203 {
	public static void main(String[] args) {
        // Personクラスのオブジェクトを作成
        Person[] persons = { new Person(), new Person(), new Person() };
        // Personオブジェクトに氏名と年齢をセット
        persons[0].setData("大島", 30);
        persons[1].setData("村上", 30);
        persons[2].setData("黒沢", 32);
        // 自己紹介
        for(int i = 0; i < persons.length; i++) {
            persons[i].introduce();
        }
        System.out.println();
        // 年齢差をチェック
		persons[0].compare(persons[1]);
		persons[1].compare(persons[2]);
		persons[2].compare(persons[1]);
		    }
}
// ここにPersonクラスを作成してください。
class Person {
	private String name;
	private int age;
	
	
	public void setData(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void introduce() {
		System.out.println("わたしの名前は" + name + "、年齢は" + age + "歳です。");
	}
	
	public void compare(Person person) {
		if(age == person.getAge()) {
			System.out.println("わたくし" + name + "は、" + person.getName() +  "さんと同じ年齢です。");
		} else if (age > person.getAge()) {
			System.out.println("わたくし" + name + "は、" + person.getName() + "さんより" + (age - person.getAge()) + "歳年上です。");
		} else {
			System.out.println("わたくし" + name + "は、" + person.getName() + "さんより" + (person.getAge() - age) + "歳年下です。");
		}
	}
	
}
