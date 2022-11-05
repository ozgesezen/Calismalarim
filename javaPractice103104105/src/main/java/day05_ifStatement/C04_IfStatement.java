package day05_ifStatement;

import java.util.Scanner;

public class C04_IfStatement {

    //Kullanici 0'dan kucuk 120'den buyuk deger giremiyecek sekilde degerleri aldiktan sonra ;
// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
// calisan erkekse 65 yasindan buyukse emekli olabilir seklinde yazdiran bir kod yaziniz.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yazınız.." + "\n Kadin icin K \n Erkek icin E harfi giriniz");
        char cinsiyet = input.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas = input.nextDouble();

        if (cinsiyet=='K'){
            if (yas<0 || yas>120){
                System.out.println("Lutfen dogru yas degerini giriniz..");
            } else if (yas>60) {
                System.out.println("Emekli olabilirsin");
            }else {
                System.out.println("Emekli olamazsın "+ (60-yas)+ " yıl daha calısmalısın");
            }

        } else if (cinsiyet=='E') {

            if (yas<0 || yas>120){
                System.out.println("Lutfen dogru yas degerini giriniz");
            } else if (yas>65) {
                System.out.println("Emekli olabilirsiniz");
            }else {
                System.out.println("emekli olamazsın "+ (65-yas)+ " yıl daha calısmalısın..");
            }

        }else {
            System.out.println("Lutfen gecerli bir fark giriniz..");
        }




    }


}
