package day02_variables;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //  Soru 1)   Kullanicinin  girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran programi yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("4 basamaklı bir sayı giriniz");
        int sayi = scan.nextInt();
         // bir sayinin birler basamagındaki rakamı %10 ile hesaplatabiliriz
        int sonRakam = sayi%10;
        int ilkRakam = sayi/1000;
        System.out.println(ilkRakam+sonRakam);

        ///  Soru 2) Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Lütfen 3 basamakli bir sayı giriniz");
        int sayi1=scan1.nextInt();
        //**1 ler basamağındaki sayıyı bulmak icin %10
        int birler=sayi1%10;
        System.out.println("girdiğiniz sayınız birler basamagı: "+birler);
        int yeniSayı= sayi1/10;


        int onlar= yeniSayı%10;
        System.out.println("girdiğiniz sayının onlar basamağı: "+onlar);
        int yüzler=sayi1/100;
        System.out.println("girdiğiniz sayının yüzler basamağı: "+yüzler);

        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz.

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı bir sayı giriniz");
        int sayi2= scan2.nextInt();
        int sonIkiBasamak = sayi2%100;
        int ilkIkiBasamak = sayi2/1000;
        System.out.println("ilk iki basamak+son iki basamak= "+(sonIkiBasamak+ilkIkiBasamak));


    }
}
