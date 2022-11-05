package practiceAdvanced.practice06;

public class Q04_Kutuphane {

    public static void main(String[] args) {

        //Kütüphaneye eklemek istediğiniz kitapları, adı, yazar adı, sayfa sayısı, seri numarası ile yazdıran bir kod yazınız.

        Kitap kitap1 = new Kitap("Harry Potter","J.K. Rowling",500);
        kitap1.kitapBilgileri();

        new Kitap("1984","George Orwell",352).kitapBilgileri();




    }

}
