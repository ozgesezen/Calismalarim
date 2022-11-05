package practiceAdvanced.practice05;

public class Q04_Varargs_HesapMakinesi {

    //Temel 4 matematik işlemi yapan bir kod yazınız.

    public static void main(String[] args) {

        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        hesapMakinesi.toplama(3,5,7,100);
        hesapMakinesi.cikarma(100,99);
        hesapMakinesi.carpma(5,8,7);
        hesapMakinesi.bolme(5,8);

    }

}
