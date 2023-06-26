package Java.JavaStudy.Operator;

public class Operator2 {
    public static void main(String[] args){
        // String s1 = "あいうえお";
        // String s2 = "あいうえお";
        // String s3 = new String("あいうえお");

        // System.out.println(s1 == s3);
        // System.out.println(s1.equals(s3));

        //「i >= 5」と「i <= 20」のどちらも正しければ　真(true)、偽(false)となる。
        int i = 10;
        System.out.println(i >= 5 && i <= 20);

        //「a > 20」と「b > 30のどちらかが正しければ、真(true)、偽(false)となる。
        int a = 10;
        int b = 20;
        System.out.println(a > 20 || b < 30);

        //「i > 20」の結果が「！」によって否定される。
        int j = 10;
        System.out.println(!(j < 20));
    }
}
