package practiceAdvanced.practice05;

public class Q05_Market_Constructor {

    //Ürün adı, ürün fiyatı ve (varsa) son kullanma tarihlerini yazdıran bir market programı yazınız..

    public static void main(String[] args) {

        Market urunObjesi = new Market("ekmek", 5,1);

        System.out.println("Urunun adi: "+urunObjesi.urunAdi+ " Urunun Fiyati: "+urunObjesi.urunFiyati+" Urunun skt: "+urunObjesi.sonKullanmaTarihi);

        Market urunObjesi2 = new Market("Nutella", 45,6);

        System.out.println("Urunun adi: "+urunObjesi2.urunAdi+ " Urunun Fiyati: "+urunObjesi2.urunFiyati+" Urunun skt: "+urunObjesi2.sonKullanmaTarihi);

        Market bardakObjesi = new Market("Bardak", 50);

        System.out.println("Urunun adi: "+bardakObjesi.urunAdi+ " Urunun Fiyati: "+bardakObjesi.urunFiyati+" Urunun skt: "+bardakObjesi.sonKullanmaTarihi);


    }

}
