package day02_variables;

public class C01_Sout {

    public static void main(String[] args) {

/*
   Soru-1 :Konsolda asagidaki ciktiyi yazdiriniz

  T
  E
  C
  H
  P
  R
  O

  E
  D
  U
  C
  A
  T
  I
  O
  N
   */
        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println(" ");//hiclikle de calısır space ile de calısır
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");

        /*
    ctrl+alt+l==>sayfayi duzenler
    \n alt satira gecirir
    \t tab bosluk birakir
    \b gerisindeki harfi siler
     \\: :\ (ters slash) yazdirir   prints a back slash
      \': ' tek tirnak yazdirir.  prints single quote
      \" :"" cift tirnak yazdirir. : prints double quote
     */


// Soru-1 : TECHPRO EDUCATION  ==>tek sout ile her hara alt alta gelecek sekilde ilk kelimeden sonra bosluk
// olacak sekilde yazdiran bir kod yaziniz

        System.out.println(" \nT\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nT\nI\nO\nN\n");
        System.out.println("\nJAVA\nILE\nGUZEL\nDUNYA");

        //Soru 3 java ile guzel dunya ==> seklinde

        System.out.println("java\tile\tguzel\tdunya");

        // Soru-4 :java ile guzel dunya  ==>cumlesinin aralarinda bosluk olmayacak sekilde yazdiran bir kod yaziniz.

        System.out.println("Java \bile \bguzel \bdunya");//\b onunde ne varsa onu siliyor

        //Pazartesi kelimesinin her hafrfinin ayrı bir satıra getirecek şekilde yazdırın

        System.out.println("P\nA\nZ\nA\nR\nT\nE\nS\nI");

        //Soru-6 : "Techpro" ile java cok 'kolay'   yazdiran bir kod yaziniz
        System.out.println("\"Techpro\" ile Java cok \'kolay\'");

        //Soru-7 : "MAHARET" hic 'DUSMEMEK'  degil; "Her dustugunde kalkabilmektir" ==>ifadesini

// "MAHARET" hic 'DUSMEMEK' degil;


//      "Her dustugunde kalkabilmektir" seklinde noktali virgulden sonra 3 satir asagidan ve satir basi yaparak yazdiran bir kod yaziniz.

        System.out.println("\"MAHARET\" hic \'DUSMEMEK\' degil;\n\n\n\t\"Her dustugunde kalkabilmektir\"");
    }

}
