package day05_ifStatement;

import java.util.Scanner;

public class C05_IfStatement {

    //Kullanicidan iki sayi alin buyuk olmayan sayiyi yazdirin.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayı giriniz");
        double sayi1 = input.nextDouble();
        double sayi2 = input.nextDouble();

        if (sayi1<sayi2){
            System.out.println("buyul olmayan sayı =" + sayi1);
        } else if (sayi1>sayi2) {
            System.out.println("buyuk olmayan sayı =" + sayi2);
        }else {
            System.out.println("sayılar birbirine esit");
        }

        //Ternary
        System.out.println(sayi1==sayi2 ? "sayılar eşit" : sayi1>sayi2 ? sayi2 : sayi1);


    }

}
