package practiceAdvanced.practice01;

public class Q03_RegexQuantifiers {

    public static void main(String[] args) {

       //Bir String değerin belirli sayıda karakter içerip belirli bir karakter ile bitip bitmediğini kontrol eden bir kod yazınız.
       String str = "as";
        System.out.println(str.matches(".s"));//iki karakterli olsun son karakter s olsun her hangi bir karakter ile baslayabilir
        //matches() methodu regex ile calisip String degerin regex ile karsilastirmasini yapar

        //Bir String değerin ikinci karakterinin belirli bir karakter olup olmadığını kontrol eden bir kod yazınız.
        String str1="ass";
        System.out.println(str1.matches(".s.*"));//.* herhangi birsey herhangi bir uzunlukta olabilir


        //Bir String değerin sadece harf içerip içermediğini kontol eden bir kod yazınız.
        System.out.println("abc".matches("[a-zA-Z]*"));//* istedigin kadar karakter olabilir demek * yerine ? koyarsan 2 karakter var demek
        System.out.println("c".matches("\\w{2}"));// w da sayilari da kabul eder

        //Bir String değerin belirli bir sayıda belirli karakterleri içerdiğini kontrol eden bir kod yazınız.
        System.out.println("aschd".matches("[a-zA-Z]{5}"));//{} icine yazdigimiz deger kadar karakter icersin istiyoruz

        //Bir String değerin belirli karakterleri en az belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.
        System.out.println("1234567".matches("[0-9]{6,10}"));//{6,10} en az 6 karakterli en fazla 10 karakterli demek. 10 u yazmaz sadece virgul koyarsak en az 6 ve fazlasi demek

        //Bir String değerin belirli karakterleri en az ve en çok belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.
        System.out.println("abcd123".matches("\\w{7,10}"));//\\w=[a-zA-Z0-9_}

        // ilk karakter 1, ikinci karekter noktalama işareti ve kalan 8 karakter rakam toplam 10 karakter olmali,
        System.out.println("1?12345678".matches("[1][\\p{Punct}]{3}[0-9]{8}"));//Punct in yaninda koydugumuz {} icine atanan deger kadar icerecek demektir

        //Note:matches() regex'de '*' asterix koyduğumuz yerden sonrasına istenilen kadar character yazılabilir anlamına geliyor
        //Note:matches() regex'de '.' koyduğumuz index'te herhangi bir character olabilir anlamına geliyor





    }

}
