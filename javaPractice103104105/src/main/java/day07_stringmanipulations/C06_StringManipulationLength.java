package day07_stringmanipulations;

import java.util.Scanner;

public class C06_StringManipulationLength {

    /**
     * Length()
     * length() method'u girilen String'in uzunlugunu verir
     * butun karakterlerin adedi (bosluklar da birer karakterdir)
     */

    //havva == legth =5  , index = 4
    public static void main(String[] args) {

        String cumle = "Bugun hava yagmurlu";
        System.out.println(cumle.length());

        String str1 = "";
        System.out.println(str1.length());

        String str2 = " ";
        System.out.println(str2.length());

        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminini ve soyisminizi giriniz: \n isim : ");

        String isim = input.nextLine();
        System.out.println("Soyisminizi giriniz");
        String soyIsim = input.nextLine();

        if (isim.length()>soyIsim.length()){
            System.out.println("isminiz soyisminizden uzun");
        } else if (isim.length()==soyIsim.length()) {
            System.out.println("Isminin soyisminize eşit uzunlukta");
        }else {
            System.out.println("Soyisminiz isminizden uzun");
        }


    }

}
