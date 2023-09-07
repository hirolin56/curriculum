package Java.Java4.java4_1;

public class Sample5 extends Sample4 {
    public void test(){
        System.out.println(this.pub_var);
        System.out.println(this.prot_var);
        System.out.println(this.pack_var);
        System.out.println(this.pri_var); // ← プライベート変数にはアクセス不可
    }

    public static void main(String[] args){
        Sample4 smp = new Sample5();
        smp.test();
    }
}
