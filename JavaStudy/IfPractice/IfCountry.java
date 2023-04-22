package JavaStudy.IfPractice;

public class IfCountry {
    public static void main(String[] args){
        
        String country = "America";
        
        //もしcountryが"America"の場合、"アメリカ合衆国"と表示
        if (country.equals("アメリカ合衆国")) {
            System.out.println(country);
        }
        //でももし、countryが"Japan"の場合、"日本"と表示
        else if (country.equals("Japan")) {
            System.out.println("日本");
        }
        //それ以外の場合、"その他"と表示
        else {
            System.out.println("その他");
        }
    }
}