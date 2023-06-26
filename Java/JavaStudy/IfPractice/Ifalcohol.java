package Java.JavaStudy.IfPractice;

import javax.lang.model.util.ElementScanner14;

public class Ifalcohol {
    public static void main(String[] args){
        //int型の変数oldに25を代入
        int old = 25;
        //String型の変数にメッセージを記載
        String allowed = "酒が飲めるぞ！";
        String willBeAllowed = "あと一年で酒が飲める！！";
        String notAllowed = "まだまだ酒が飲めない・・・";

        //もし、20歳以上の場合、"酒が飲めるぞ！"と表示
        if (old >= 20) {
            System.out.println(allowed);
        }
        //でももし、19歳の場合は、"あと一年で酒が飲める！"と表示
        else if (old == 19) {
            System.out.println(willBeAllowed);
        }
        //それ以外の場合は、"まだまだ酒が飲めない・・・"と表示
        else {
            System.out.println(notAllowed);
        }

    }
}
