package day06_nestedifswitch;

import java.util.Scanner;
import java.util.SortedMap;

public class C06_SwitchCase {

    public static void main(String[] args) {

        //Ex: Girilen pozitif 3 basamaklı bir sayıyı yazı ile yazdırınız

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen 3 basamaklı pozitif sayi giriniz");
        int sayi = input.nextInt();

        int birlerBas = sayi%10;
        int onlarBas = (sayi/10)%10;
        int yuzlerBas = (sayi/100);
        if (sayi>99 && sayi<1000){
        switch (yuzlerBas) {
            case 0:
                System.out.print("");
                break;
            case 1:
                System.out.print("Yuz ");
                break;
            case 2:
                System.out.print("İki Yuz ");
                break;
            case 3:
                System.out.print("Uc Yuz ");
                break;
            case 4:
                System.out.print("Dort Yuz ");
                break;
            case 5:
                System.out.print("Bes Yuz ");
                break;
            case 6:
                System.out.print("Altı Yuz ");
                break;
            case 7:
                System.out.print("Yedi Yuz ");
                break;
            case 8:
                System.out.print("Sekiz Yuz ");
                break;
            case 9:
                System.out.print("Dokuz Yuz ");
                break;

            }

        }
            switch (onlarBas) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("on ");
                    break;
                case 2:
                    System.out.print("yirmi ");
                    break;
                case 3:
                    System.out.print("otuz ");
                    break;
                case 4:
                    System.out.print("kırk ");
                    break;
                case 5:
                    System.out.print("elli ");
                    break;
                case 6:
                    System.out.print("altmış ");
                    break;
                case 7:
                    System.out.print("Yetmiş ");
                    break;
                case 8:
                    System.out.print("Seksen ");
                    break;
                case 9:
                    System.out.print("Doksan ");
                    break;
        }switch (birlerBas) {
            case 0:
                System.out.print("");
                break;
            case 1:
                System.out.print("bir");
                break;
            case 2:
                System.out.print("iki");
                break;
            case 3:
                System.out.print("üç");
                break;
            case 4:
                System.out.print("dört");
                break;
            case 5:
                System.out.print("beş");
                break;
            case 6:
                System.out.print("altı");
                break;
            case 7:
                System.out.print("Yedi");
                break;
            case 8:
                System.out.print("Sekiz");
                break;
            case 9:
                System.out.print("Dokuz");
                break;
        }



        }



    }

