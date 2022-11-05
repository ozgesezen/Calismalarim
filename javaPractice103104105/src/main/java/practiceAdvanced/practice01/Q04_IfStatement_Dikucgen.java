package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q04_IfStatement_Dikucgen {

    public static void main(String[] args) {

        //Kullanıcıdan üç adet sayı alarak bu sayıların
        //        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplayan bir kod yazınız.
        //        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        //        bağlantısından yararlanabilirsiniz)
        //        Örnek Ekran Çıktısı:
        //        birinci kenarı giriniz: 3
        //        ikinci kenarı giriniz 4
        //        üçüncü kenarı giriniz: 5
        //        Bu bir dik üçgendir
        //        birinci kenarı giriniz: 2
        //        ikinci kenarı giriniz 15
        //        üçüncü kenarı giriniz: 7
        //        Bu bir dik üçgen değildir.


        Scanner input = new Scanner(System.in);
        System.out.println("Lutgen dik ucgenin uzunluklarini giriniz");
        int uzunluk1 = input.nextInt();
        int uzunluk2 = input.nextInt();
        int uzunluk3 = input.nextInt();

        if (uzunluk1*uzunluk1+uzunluk2*uzunluk2==uzunluk3*uzunluk3){
            System.out.println("Dik ucgen");
        } else if (uzunluk2*uzunluk2+uzunluk3*uzunluk3==uzunluk1*uzunluk1) {
            System.out.println("Dik ucgen");
        } else if (uzunluk3*uzunluk3+uzunluk1*uzunluk1==uzunluk2*uzunluk2) {
            System.out.println("Dik ucgen");
        }else {
            System.out.println("Dik ucgen degil");
        }
    }

}
