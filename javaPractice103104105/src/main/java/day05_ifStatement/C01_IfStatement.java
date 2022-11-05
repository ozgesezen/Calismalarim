package day05_ifStatement;

import java.util.Scanner;

public class C01_IfStatement {

    /*Soru 6) Kullanicidan iki sayi isteyin,
 sayilarin ikisi de pozitif ise "sayilarin toplamini "yazdirin,
 sayilarin ikisi de negative ise "sayilarin carpimini" yazdirin,
 sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
 sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ilk sayı giriniz..");
        double sayi = input.nextDouble();
        System.out.println("Lutfen ikinci sayıyı giriniz..");
        double sayi2 = input.nextDouble();

        if (sayi>0 && sayi2>0){
            System.out.println(sayi+sayi2);
        } else if (sayi<0 && sayi2<0) {
            System.out.println(sayi*sayi2);
        } else if (sayi*sayi2<0)  {
            System.out.println("farklı işaretlerde sayilarla islem yapamazsın");
        }else {
            System.out.println("Sifir carpmaya gore yutan elemandır");
        }


    }

}
