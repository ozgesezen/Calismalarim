package day03_ifStatement;

public class C02_AsciiDegerleri {

    public static void main(String[] args) {

        char harf='a';
        char harf2='A';
        System.out.println("harf>harf2==>"+(harf>harf2)); //karşılaştırma işlemlerinin sonucunu true yada false döner boolean yani
        //buyuk harflerin ascii degerleri kucuk harflerin asci degerlerinden daha kucuktur

        //Example 1: Herhangi bir char variable'ni ASCII degerlerini kod yazarak bulunuz

        char harf3 = 'c';
        System.out.println(harf3+0); //harfin ascii degerini hesaplamak için toplamaya etkisi olmayan 0 ı seçeriz. böylece saydırdığımız deger bize harfin ascii degerinin verir

        char space = ' ';
        System.out.println("Space'in ascii degeri:"+(space+0));

        //2.yol
        //Char'larda Java char karaktere int da atayabiliriz. cunku char!ın bir resim karakteri bir de sayısal ascii degeri vardır. Bu nedenleASCII degerlerini hesaplayabiliriz.
        int harf4 ='m';
        System.out.println("m'nin ASCII degeri = " + harf4);

        //Example 2: kıyaslama
        byte b1 = 12;
        byte b2 = -125;
        System.out.println("b1>b2 ==>"+(b1>b2));//true

        float f1 = 2.45645f;
        float f2 = 5.86786F;
        System.out.println("f1>f2 ==>"+(f1>f2));//false
        System.out.println("b1>f1 ==>"+(b1>f1));//true

        long long1 = 5845685455L;
        System.out.println("b1<long1 ==>"+(b1<long1));

        char ch = 'h';
        System.out.println("b1>ch ==>"+(b1>ch));


    }

}
