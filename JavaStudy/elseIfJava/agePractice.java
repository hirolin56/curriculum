package JavaStudy.elseIfJava;

public class agePractice {
    public static void main(String[] args){
        
        //年齢
        int age = 24;

        //学生かどうか
        boolean is_student = false;

        //「学生割引」文言
        String student_DC = "学割パックが使えるよ";

        //「若者割引」文言
        String yang_DC = "若者応援割引が使えるよ";

        //もし、年齢が25歳未満　かつ　学生の場合、"学割パックが使えるよ"と表示
        if (age < 25 && is_student) {
            System.out.println(student_DC);
        }
        //でももし、年齢が25歳未満の場合、"若者応援割引が使えるよ"と表示
        else if (age < 25) {
            System.out.println(yang_DC);
        }

    }
}