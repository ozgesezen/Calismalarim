package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q02_Substring_AdSoyad {

    public static void main(String[] args) {

      /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isim ve soy isim giriniz");
        String adSoyad = input.nextLine();
        String soyad = adSoyad.split(" ")[1];
        String ad = adSoyad.split(" ")[0];
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: "+ soyad);

        String ad1 = adSoyad.substring(0,adSoyad.indexOf(" "));
        String soyad1 = adSoyad.substring(adSoyad.indexOf(" ")+1);
        System.out.println("Ad: " +ad1);
        System.out.println("Soyad: " +soyad1);

    }

}
