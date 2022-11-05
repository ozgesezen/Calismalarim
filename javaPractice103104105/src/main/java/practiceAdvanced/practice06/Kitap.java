package practiceAdvanced.practice06;

public class Kitap {

    String kitapAdi;
    String yazarAdi;
    int sayfaSayisi;
    String seriNo;
    static int kitapSayisi;

    public Kitap(String kitapAdi, String yazarAdi, int sayfaSayisi) {
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.sayfaSayisi = sayfaSayisi;
        kitapSayisi++;
        this.seriNo = kitapAdi.substring(0, 2) + yazarAdi.substring(0, 2) + kitapSayisi;
    }

    public void kitapBilgileri() {
        System.out.println("Kitap Adi = " + kitapAdi + "\n Yazar Adi: " + yazarAdi + "\n Sayfa Sayisi: " + sayfaSayisi + "\n Seri No: " + seriNo);
        System.out.println("=======================");
    }
}
