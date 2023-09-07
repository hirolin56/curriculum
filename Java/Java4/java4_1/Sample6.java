package Java.Java4.java4_1;
public class Sample6 {
    public static void main(String[] args){

        Sample4 smp = new Sample4();
        
        System.out.println(smp.pub_var);
        //protected以下のメンバーにはアクセス不可
        //System.out.println(smp.prot_var);
        //System.out.println(smp.pack_var);
        //System.out.println(smp.pri_var);
    }
}
