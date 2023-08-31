package exday5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ProbEx5_4 {

	public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //  コンソールから文字列の読み込み
        ArrayList<String> list = new ArrayList<>();
        
        while(true) {
        	String buf = br.readLine();
            System.out.println("文字列を入力:" + buf);
            if(buf.equals("")) {
            	break;
            }
            list.add(buf);
        }
        for(String s : list) {
        	System.out.print(s + " ");
        }
        
    }

}
