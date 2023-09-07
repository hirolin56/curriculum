package Java.Java4.java4_1;

public class Sample4 {
    public String pub_var = "publicだよ";
    protected String prot_var = "protected";
    String pack_var = "package privateだよ";
    public String pri_var = "privateだよ";

    public void test(){
        //クラス内部では全てのレベルのメンバーにアクセス可
        System.out.println(this.pub_var);
        System.out.println(this.pack_var);
        System.out.println(this.prot_var);
        System.out.println(this.pri_var);
    }

    public static void main(String[] args){
        Sample4 smp4 = new Sample4();
        smp4.test();
    }
}