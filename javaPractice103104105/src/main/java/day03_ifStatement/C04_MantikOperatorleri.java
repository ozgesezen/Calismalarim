package day03_ifStatement;

public class C04_MantikOperatorleri {
    public static void main(String[] args) {

        //&& ile & arasındaki fark
        //&& de boolean sonuc 3 te bir tane false bulunca durur tum satırı kontrol etmeye calışmaz
        //ancak & tum satırı kontrol eder ondan sonra durur
        //sonuçta fark yok sadece biri ilk hatayı bulduğunda durur diğeri sonuna kadar gider.&& daha hızlı

        System.out.println(5+2==8);//false

        boolean sonuc1 = 5>4 && 7<9 && 6+3==9 && 5+2!=8;
        System.out.println( "sonuc1==>"+sonuc1);//true

        boolean sonuc2 = 5>4 && 7>9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuc2==>"+sonuc2);//false

        int sayi1 = 15;
        //sayi!un '10 ile 20 araliginda oldugunu true diyerek dondurelim
        //10<sayi<20 Java uclu karsilastirma yapma
        // ikili karsilaştırmalar yapip mantıksal operatorlar ile birleştirmeliyiz

        System.out.println(10<sayi1 && sayi1<20);

        int sayi2 = 5;
        System.out.println(sayi2<10 || sayi2>20);//true

        //&&: ve ||:veya ve'de ikitarafında dogru olması gerekir ||'da birinin dogru olmasu yeterli


    }
}
