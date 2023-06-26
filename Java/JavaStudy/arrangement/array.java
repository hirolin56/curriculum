package Java.JavaStudy.arrangement;

public class array {
    public static void main(String[] args) {   
    int[] arr = new int[5];

    arr[0] = 3;     //1番目(先頭)の要素に3を代入
    arr[1] = 1;     //2番目の要素に1を代入
    arr[2] = 6;     //3番目の要素に6を代入
    arr[3] = 0;     //4番目の要素に0を代入
    arr[4] = 4;     //5番目の要素に4を代入

    int[] a = {6, 10, 3, 1, 8};

    int[] arr2 = {2, 0, 95};
    
    //配列arrのlengthフィールドを表示してみる。　→ 要素数は「3」が表示される
    System.out.println("配列arrの要素数..." + arr.length);
    System.out.println(arr[2]);

    //要素数が3のStringクラスの配列 str Array を定義
    String[] strArray = new String[3];
    //2番目の要素値(or添字(インデックス)が1の要素値)を文字列で初期化
    strArray[1] = "ABC";
    }
}
