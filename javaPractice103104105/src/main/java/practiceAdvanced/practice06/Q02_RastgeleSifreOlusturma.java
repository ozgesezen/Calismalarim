package practiceAdvanced.practice06;

import java.util.Scanner;

public class Q02_RastgeleSifreOlusturma {

    public static void main(String[] args) {

        //Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele şifre üreten bir kod yazınız.
        //Buyuk kucuk harf ve rakam icersin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int karakterSayisi = input.nextInt();
        String sifre = "";
        int sayac = 0;

        String karakterler = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int maxIndeks = karakterler.length();

        while (sayac<karakterSayisi){
            int rasgeleIndeks = (int)(Math.random()*maxIndeks);
            sifre += karakterler.charAt(rasgeleIndeks);
            sayac++;
        }
        System.out.println("Sifre= "+sifre);


    }

}
