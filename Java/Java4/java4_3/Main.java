package Java.Java4.java4_3;

public class Main {
    public static void main(String[] args){
        //底辺(base)と高さ(height)の変数を指定
        int base = 10;
        int height = 5;

        //Studyクラスのインスタンスを生成して、Studyクラス型の変数studyに保持する
        Sample sample = new Sample();

        //生成したインスタンスからを生成して、Studyクラス型の変数studyに保持する
        sample.printTriangleArea(base, height);
    }
}
