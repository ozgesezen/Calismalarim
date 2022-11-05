package day07_stringmanipulations;

public class C09_StringManipulations {

    //Soru 1) Kullanicidan email adresini girmesini isteyin,
// mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
// @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
// @gmail.com ile bitmiyorsa "lutfen yazimı kontrol edin" yazdırın

    public static void main(String[] args) {

        String str = "ozgesezen@gmail.com";
        String arananMetin = "@gmail.com";

        if (!str.contains(arananMetin)){
            System.out.println("Lutfen gmail adresinizi giriniz");
        } else if (str.endsWith(arananMetin)) {
            System.out.println("Email adresiniz kabul edildi");
        }else {
            System.out.println("Lutfen yazımı kontrol edin");
        }

    }

}
