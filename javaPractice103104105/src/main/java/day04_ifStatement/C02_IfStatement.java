package day04_ifStatement;

import java.util.Scanner;

public class C02_IfStatement {

    /*
    Ogrenci asagidaki gibi notlar aldiginda karsisindaki degerleri yazdiran bir kod yaziniz
                 not hesaplayici
              90 ~100 => A  Cok Iyi
              80 ~ 89 => B  Iyi
              70 ~ 79 => C  Orta
              60 ~ 69 => D  Gecer
              0 ~ 59  => F  Zayif
   */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz..");
        int not = input.nextInt();

        if (not<=100 && not>=90) {
            System.out.println("A çok iyi");
        } else if (not<=89 && not>=80) {
            System.out.println("B iyi");
        } else if (not<=79 && not>=70) {
            System.out.println("C Orta");
        } else if (not<=69 && not>=60) {
            System.out.println("D gecer");
        } else if (not<=59 && not>=0) {
            System.out.println("zayıf");
        }
    }

}
