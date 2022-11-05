//package day07_stringmanipulations;
//
//import java.util.Scanner;
//
//public class C10_StringManipulations {
//
//    /*
//       Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
//                   i)En az 8 character icermeli
//                   ii)Space characteri icermemeli
//                   iii)Buyuk harf icermemeli
//                   iv)Son characteri "." olmali
//
//*/
//    public static void main(String[] args) {
//
//       Scanner input = new Scanner(System.in);
//        System.out.println("Lutfen sifre giriniz");
//        String str = input.nextLine();
//
////        boolean karakterSayisi = str.length()>=8;
////        boolean spaceIcerme = !str.contains(" ");
////       // boolean buyukKarakter = str.replaceAll("[A]","Z");
////        boolean sonKarakter = str.endsWith(".");
////        boolean kontrol = karakterSayisi && spaceIcerme && buyukKarakter && sonKarakter;
////
////        System.out.println(kontrol);
////        System.out.println(buyukKarakter);
////
////        if (karakterSayisi==false){
////            System.out.println("8 veya daha fazla karakter giriniz");
////        } else if (spaceIcerme==false) {
////            System.out.println("bosluk kullanmayiniz");
////        } else if (buyukKarakter==true) {
////            System.out.println("buyuk karakter kullanmayiniz");
////        } else if (sonKarakter==false) {
////            System.out.println("son karakter nokta icermeli");
////        }else {
////            System.out.println("Gecerli");
//        }
//
//        String pwd = "java1234*4.";
//        //i)En az 8 character icermeli
//        boolean kural1 = pwd.length() > 7;
//        //ii)Space characteri icermemeli
//        boolean kural2 = !pwd.contains(" ");
//        //iii)Buyuk harf icermemeli
//        boolean kural3 = !pwd.contains("[A-Z]");
//        //iv)Son characteri "." olmali
//        boolean kural4 = pwd.charAt(pwd.length() - 1) == '.';
//        System.out.println(kural1 && kural2 && kural3 && kural4);//true
//
//
//    }
//
//}
