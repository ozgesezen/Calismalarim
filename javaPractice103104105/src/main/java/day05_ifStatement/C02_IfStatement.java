package day05_ifStatement;

import java.util.Scanner;

public class C02_IfStatement {

    // Kullanicidan yasini isteyin
// 65 veya daha buyukse emekli olabilirsin
// 65'den kucukse emekli olamazsin "? sene daha calisman lazim" yazdirin

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasınızı pozitif sayı olarak giriniz..");
        int yas = input.nextInt();

//        if (yas >= 65){
//            System.out.println("Emekli olabilirsin");
//        }else {
//            System.out.print("Emekli olamazsın = ");
//            System.out.println(65-yas + " sene daha calısmalısın..");
//        }

        //nested if else

        if (yas>=0){
            if (yas >=65){
                System.out.println("Emekli olabilirsin");
            }else {
                System.out.print("emekli olamazsın");
                System.out.println(65-yas + " sene daha calısmalısın");
            }

        }else {
            System.out.println("Lutfen buyuk bir sayi giriniz..");
        }
    }

}
