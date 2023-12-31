package javaOOP2;

public class Q211 {

	public static void main(String[] args) {

        // 3匹の動物たちを表すAnimal配列型変数animalsの宣言と
        // 配列オブジェクトの生成
		Animal[] animals = new Animal[3];
        // 動物たち配列変数の各要素に、順番に犬・猫・鳥
        // オブジェクトを生成・代入
		animals[0] = new Dog();
		animals[1] = new Cat();
//		animals[2] = new Bird();
        // forループを使って動物たち配列変数を順にみていき、
        // 各動物の歌うsingメソッドの呼び出し
		for(Animal a : animals) {
			a.sing();
		}
    }
}

// 動物クラス
abstract class Animal {
    public abstract void sing();
}

// ここにDogクラスを作成してください
class Dog extends Animal {
	public void sing() {
		System.out.println("わんわん");
	}
}
// ここにCatクラスを作成してください
class Cat extends Animal {
	public void sing() {
		System.out.println("にゃーにゃー");
	}
}

// ここにBirdクラスを作成してください
/*class Bird extends Animal {
	public void sing() {
		System.out.println("ぴよぴよ");
	}
}*/


