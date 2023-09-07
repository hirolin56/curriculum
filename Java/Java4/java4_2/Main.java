package Java.Java4.java4_2;
class Sample4{
    String str = "Hoge Engineer";

    //コンストラクタ
    public Sample4(String str){
        System.out.println(str);
    }
}

public class Main {
    public static void main(String[] args){
        //インスタンスの生成
        Sample4 smp2 = new Sample4("Hoge System Engineer");
    }
}
