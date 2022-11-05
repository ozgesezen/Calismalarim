package practiceAdvanced.practice05;

import java.util.Scanner;

public class Q01_Ascii {

    public static void main(String[] args) {

        //Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Ilk karakteri giriniz");
        char ch = input.next().charAt(0);
        System.out.println("Ikinci karakteri giriniz");
        char ch1 = input.next().charAt(0);

        int ilk = Math.min(ch,ch1);
        int son = Math.max(ch,ch1);

        for (int i=ilk+1; i<son; i++){
            System.out.print((char) i+" ");

        }

    }

}
