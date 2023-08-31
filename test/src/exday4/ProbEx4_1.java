package exday4;

public class ProbEx4_1 {

	public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        CellPhone2 cp = new CellPhone2();
        funcPhone(cp);
        funcMailer(cp);
        funcComputer(cp);
    }
    //  電話としての処理
    public static void funcPhone(ICellPhone phone){
        phone.callPhone();      //  電話を掛ける
        phone.recievePhone();   //  電話を受ける
    }
    //  メーラーとしての処理
    public static void funcMailer(IMailer mailer){
        mailer.sendMail();      //  メールを送信する
        mailer.recieveMail();   //  メールを受信する
    }
    //  コンピュータとしての処理
    public static void funcComputer(IComputer computer){
        computer.playGame();    //  ゲームをする
        computer.borwseWeb();   //  ウェブを閲覧する
    }

}
