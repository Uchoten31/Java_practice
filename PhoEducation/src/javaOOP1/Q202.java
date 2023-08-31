package javaOOP1;

public class Q202 {
	public static void main(String[] args) {

        // 1匹目のペットオブジェクトの生成
        Pet pet1 = new Pet();

        // 1匹目のペットデータを設定
        pet1.setType("犬");
        pet1.setName("コタロー");
        pet1.setAge((byte)4);
        pet1.setGender(false);

        // 2匹目のペットオブジェクトの生成
        Pet pet2 = new Pet();

        // 2匹目のペットのデータを設定
        pet2.setType("猫");
        pet2.setName("ミー");
        pet2.setAge((byte)2);
        pet2.setGender(true);

        // 2匹のペットの紹介文を取得し、表示する
        System.out.println(pet1.getIntroduction());
        System.out.println(pet2.getIntroduction());

    }
}


// ここにPetクラスを作成してください。
class Pet {
	private String type;
	private String name;
	private byte age;
	private boolean gender;
	

	public void setType(String type) {
		this.type = type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public String getIntroduction() {
		return type + "の" + name + "は" + (gender ? "メス" : "オス") + "で" + age + "歳です。";
	}
	
	
}
