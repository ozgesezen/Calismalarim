package day05_ifStatement;

import java.util.Scanner;

public class C07_IfStatement {

    //Kullanicidan dortgenin kenar uzunluklarini isteyin
//ve dikdortgenin kare olup  olmadigini yazdirin

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen birinci kenar uzunlugunu giriniz..");
        int kenar1 =input.nextInt();

        System.out.println("lutfen ikinci kenar uzunlugunu giriniz");
        int kenar2 = input.nextInt();

        System.out.println("lutfen ucuncu kenar uzunlugunu giriniz");
        int kenar3 = input.nextInt();

        System.out.println("lutfen dorduncu kenar uzunlugunu giriniz");
        int kenar4 = input.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar3==kenar4){
            System.out.println("Bu cisim bir karedir");
        }else {
            System.out.println("kare degildir");
        }
    }

}
