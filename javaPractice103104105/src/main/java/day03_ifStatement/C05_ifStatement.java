package day03_ifStatement;

import java.util.Scanner;

public class C05_ifStatement {

    public static void main(String[] args) {

        /* TASK :
        kullanıcıdan alacağınız iki sayıyı yine kullanıcıya sectireceğiniz
        dört işlemden biri ile işleme koyup sonucu yazdırınız
         */
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen \n toplama islemi icin 1 \n cıkarma islemi icin 2 \n bolme islemi icin 3 \n carpma islemi icin 4\n giriniz ");

        int islem = input.nextInt();//kullanıcının işlem tercihi için variable oluşturduk
        System.out.println("Lutfen iki tam sayı giriniz : ");//kullanıcıya bildirimde bulunduk
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        if (islem == 1) {
            System.out.println("toplama isleminin sonucu : " + num1 + num2);
        } else if (islem == 2) {
            System.out.println("cıkarma işleminin sonu : " + (num1 - num2));
        } else if (islem == 3) {
            System.out.println("bolme isleminin sonucu :" + num1 / num2);
        } else if (islem == 4) {
            System.out.println("carpma işleminin sonucu :" + num1 * num2);
        }else {
            System.out.println("hatalı giriş");
        }

    }

}
