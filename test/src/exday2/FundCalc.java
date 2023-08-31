package exday2;

public class FundCalc {
	
	public int number1 = 0;   //  一つ目の数
    public int number2 = 0;   //  二つ目の数
    //  一つ目の数を設定
    public void setNumber1(int number1){
        this.number1 = number1;
    }
    //  二つ目の数を設定
    public void setNumber2(int number2){
        this.number2 = number2;
    }
    //  一つ目の数を設定
    public int getNumber1(){
        return number1;
    }
    //  二つ目の数を設定
    public int getNumber2(){
        return number2;
    }
    //  二つの数の和を出力
    public int add(){
        return number1 + number2;
    }
    //  二つの数の差を出力
    public int sub(){
        return number1 - number2;
    }

}
