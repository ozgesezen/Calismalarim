package day02_variables;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String kullaniciIsmi = input.next();

        //Soru 1 ) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplatan bir program yazdirin
//( CEMBERIN CEVRESI = 2*3.14*r  DAIRENIN ALANI = 3.14*r*r  )

Scanner scan = new Scanner(System.in);
        System.out.println("yarıcap giriniz");
        double r = scan.nextDouble();
        System.out.println(" çemberin çevresi="+2*3.14*r/100);
        System.out.println("dairenin alanı="+3.14*r*r);


        //Soru 2 )  Kullanicidan bir dikdortgenin uzun ve kisa kenarlarini isteyip o dikdortgenin alan ve
// cevre hesabini yapan bir program yaziniz.

        Scanner Scan1 = new Scanner(System.in);
        System.out.println("kısa kenar giriniz");
        double kısaKenar = Scan1.nextDouble();
        System.out.println("uzun kenar giriniz");
        double uzunKenar = Scan1.nextDouble();

        System.out.println("Dikdörtgenin alanı:"+kısaKenar*uzunKenar);
        System.out.println("Dikdörgenin çevresi:"+2*(kısaKenar+uzunKenar));

        //Soru 3) Kenar uzunluklari kullanicidan alinana bir ucgenin cevresini hesaplayan bir program yaziniz.(byte kullanin)
// Ucgenin cevresi=a+b+c

        Scanner scan2 = new Scanner(System.in);
        System.out.println("ucgenin kenar uzunluklarını giriniz");
        byte a = scan2.nextByte();
        byte b = scan2.nextByte();
        byte c = scan2.nextByte();
        int cevre = a+b+c;
        System.out.println("ucgenin cevresi= "+cevre);

        // Soru4)   /*Kullanicidan aldiginiz sekille asagidaki gibi bir gorunum olusturan bir kod yaziniz

/*
             A
            A A
           A A A
    */
        Scanner scan3= new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char ch = scan3.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch);
        System.out.println(ch+" "+ch+" "+ch);


    }

}
