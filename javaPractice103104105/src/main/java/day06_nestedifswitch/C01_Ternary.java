package day06_nestedifswitch;

import java.util.Scanner;

public class C01_Ternary {

    public static void main(String[] args) {

        /*
TASK :
 Kullanıcıdan sifirdan buyuk pozitif bir tamsayı girmesini isteyin.
 Girilen pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
 3 basamaklı degilse çift olup olmadigini kontrol edin.
 Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
 Çift sayı degilse "3 basamaklı olmayan tek sayı yazdırın."
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Sıfırdan buyuk bir tamsayi giriniz.");

        int sayi = input.nextInt();

        System.out.println("***************Ternary ile cozum***********");

        String sonuc = sayi>0  ?  sayi>99 && sayi<1000  ? ("Uc basamaklı sifirdan buyuk sayi") :
                (sayi%2==0)  ?  ("Uc basamaklı olmayan cift sayi") :  ("Uc basamaklı olmayan tek sayı") :
                "Lutfen sıfırdan buyuk bir sayi giriniz";
        System.out.println(sonuc);

        System.out.println("**********if else ************");

        if(sayi>0){
            if (sayi<1000 && sayi>99){
                System.out.println("3 basamaklı pozitif sayı");
            } else if (sayi%2==0) {
                System.out.println("3 basamaklı olmayan çift sayı");
            }else {
                System.out.println("3 basamaklı olmayan tek sayi");
            }

        }else {
            System.out.println("Lutfen sıfırdan büyük bir sayı giriniz");
        }


    }

}
