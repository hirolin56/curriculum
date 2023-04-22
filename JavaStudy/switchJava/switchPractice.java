package JavaStudy.switchJava;

public class switchPractice {
    public static void main(String[] args) {
        int kubun = 2;
        
        switch (kubun) {
            case 1:
            System.out.println("kubunが1の時の処理を行います。");
            break;
            case 2:
            System.out.println("kubunが2の時の処理を行います。");
            break;
            case 3:
            System.out.println("kubunが3の時の処理を行います。");
            case 9:
            System.out.println("kubunが9の時の処理を行います。");
            default:
            System.out.println("kubunが想定外の値の時の処理を行います。");
            break;
        }
    }
}
