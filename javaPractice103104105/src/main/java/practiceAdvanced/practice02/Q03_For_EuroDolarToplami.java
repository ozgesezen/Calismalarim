package practiceAdvanced.practice02;

import java.util.Arrays;

public class Q03_For_EuroDolarToplami {

    public static void main(String[] args) {

        /*
      Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamların bulan bir kod yazınız.
      Ornek:
       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168
       */

        String str = "$1 $12 €34 €56 $45 €78";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        int dolarToplami = 0;
        int euroToplami = 0;
        for (String w : arr){
            if (w.contains("$")){
                dolarToplami+= Integer.parseInt(w.replace("$",""));//parse String i int e cevirmek icin kullandik
            }else {
                euroToplami+=Integer.parseInt(w.replace("€",""));
            }
        }
        System.out.println("dolarToplami = " + dolarToplami+"$");
        System.out.println("euroToplami = " + euroToplami+"€");

    }

}
