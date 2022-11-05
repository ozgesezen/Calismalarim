package day01_variables;

public class C02_Variables {
    public static void main(String[] args) {
        // 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin

        String okulIsmi = "Teachpro";
        System.out.println("okulIsmi = " + okulIsmi);

        char ilkHarf = 'K';
        System.out.println("ilkHarf = " + ilkHarf);

        int sayi = 20;
        System.out.println("sayi = " + sayi);

        String isim = "Ahmet Can";
        String soyIsim = "Ates";

        System.out.println("isim = " + isim);
        System.out.println("soyIsim = " + soyIsim);

        //3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin

        short a = 1;
        int b = 2;
        int toplam = a+b;
        System.out.println("toplam=" + toplam);
        System.out.println("İki farklı data türünün toplamı:" + (a+b));

        //bir tam sayı ve bir ondalık varianle olusturun toplamı yazdır

        int x = 10;
        double y = 0.5;
        double top = x+y;
        System.out.println("top=" + top);

        //bir tam sayı ile tam sayıyı toplayınız

        int z = 20;
        char harf='m';
        int toplam1= z+harf;
        System.out.println("toplam1 = " + toplam1);



    }
}
