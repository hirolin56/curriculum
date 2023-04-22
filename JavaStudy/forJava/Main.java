package JavaStudy.forJava;

public class Main {
    public static void main(String[] args){

        for (int i = 1; i <= 9; i++){
            //1つの段を表示
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + " ");
        }
        System.out.println();
        }
    }
}
