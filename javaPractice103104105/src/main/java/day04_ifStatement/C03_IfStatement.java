package day04_ifStatement;

import java.util.Scanner;

public class C03_IfStatement {

    public static void main(String[] args) {

        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir gun giriniz..");
        //String gun = input.next().toLowerCase();
        // String'lerde == neden kullanılmaz. Onun yerine equals kullanılır.
        //Cunku Java 2 tane memory var. Stack ve Heap.
        //String'de referans degerinede bakildigi icin == yerine Equals kullanılır
//        if (gun.equals("cuma")){
//            System.out.println("Muslumanlar icin kutsal gun");
//        } else if (gun.equals("cumartesi")) {
//            System.out.println("yahudiler icin kutsal gun");
//        } else if (gun.equals("pazar")) {
//            System.out.println("Hristiyanlar icin kutsal gun");
//        }else {
//            System.out.println("dini bir gun değil");
//        }

        //2Yol
        /* String gun = input.next();
        if (gun.equalsIgnoreCase("cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        }
        if (gun.equalsIgnoreCase("cumatesi")){
            System.out.println("Yahudiler icin kutsal gun");
        }
        if (gun.equalsIgnoreCase("pazar")){
            System.out.println("Hristiyanlar icin kutsal gun");
        }
        if (!gun.equalsIgnoreCase("cuma") && !gun.equalsIgnoreCase("cumartesi") && !gun.equalsIgnoreCase("pazar")){
            System.out.println("kutsal gun değil");
        }*/

        //3. yol

    }

}
