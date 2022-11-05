package day07_stringmanipulations;

import java.util.Scanner;

public class C07_StringManipulations {

    // Kullanicidan 4 harfli bir kelime isteyin
// ve girilen kelimeyi tersten yazdirin

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("4 harfli bir  kelime girin");

        String str = input.next();

        if (str.length()<4){
            System.out.println("4 harfli giriniz");
        } else if (str.length()==4) {
            char bir = str.charAt(0);
            char iki = str.charAt(1);
            char uc = str.charAt(2);
            char dort = str.charAt(3);
            System.out.println("tersten yazılmış hali ="+ dort+uc+iki+bir);
        }else if (str.length()>4){
            System.out.println("Girdiginiz kelime 4 karakterden uzun");
        }

    }

}
