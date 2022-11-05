package day04_ifStatement;

import java.util.Scanner;

public class C01_IfStatement {

    /*
     * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     *
     * INPUT  ==>  OUTPUT
     *  Y     ==>   YES ;
     *  N     ==>   NO
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Y yada N harfi ikilisinden birini giriniz");
        char karakter = input.next().charAt(0);

        if (karakter == 'Y' || karakter=='y'){
            System.out.println("YES");
        } else if (karakter == 'N' || karakter=='n') {
            System.out.println("NO");
        } else {
            System.out.println("Lufen y yada n giriniz");
        }



    }

}
