package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q05_DoWhile_TahminOyunu {

    public static void main(String[] args) {

        //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
        //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!!.

        Scanner input = new Scanner(System.in);
        int sayi;
        int rastgeleSayi = (int)(Math.random()*100)+1;//random 0-1 arasinda bir sayi verir 0.67 gibi 100 lere carparak 67 yapiyoruz araliga 100 de eklemek icin +1 dedik
        System.out.println("rastgele sayi= "+rastgeleSayi);
       int sayac =0;


        do {
            System.out.println("0-100 arasi bir sayi tahmini giriniz");
            sayac++;
            sayi = input.nextInt();
            if (sayi==rastgeleSayi){
                System.out.println("Tebrikler");
            } else if (sayi<rastgeleSayi) {
                System.out.println("Daha buyuk bir sayi giriniz");
                System.out.println(10-sayac + "kahhiniz kaldi");
            } else if (sayi>rastgeleSayi) {
                System.out.println("Daha kucuk bir sayi giriniz");
                System.out.println(10-sayac + "kahhiniz kaldi");
            }
            if (sayac==10){
                System.out.println("Oyunu kaybettiniz..\nTekrar oynamak icin 1, cikmak icin herhangi bir sayi kullaniniz");
                int secenek = input.nextInt();
                if (secenek==1){
                    sayac =0;
                    rastgeleSayi = (int)(Math.random()*100)+1;
                }else {
                    break;
                }
            }

        }while (sayi!=rastgeleSayi);

    }

}
