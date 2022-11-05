package day01_variables;

public class C01_Variables {
    /*
    /*
   Variable
     bellekte (memory) ayrilmis olan alanin (reserved area) adidir.
     Variable icinde deger saklayan bir konteynirdir
   //bir variable oluştururken içerisine koyacağimiz datanın değer alabileceği değerlere uygun bir data türü seçmeliyiz
   //örneğin bir şehrin nufusundan bahsediyorsak variablemızın data türü String,boolean,char veya double alamayız
   //geriye kalan tamsayı  turlerınden şehrin nufusunu içine alabilecek büyüklükte bir data turu seceebiliriz
   //kurs boyunca genelde tam sayılar için int ondalıklı sayılar için double kullanacagız
     */
    public static void main(String[] args) {
        System.out.println("Hello Word");

        int level = 1;
        System.out.println(level);

        boolean ogrenciMi = true;
        boolean yagisVarMi = false;

        System.out.println("yagisVarMi =" + yagisVarMi);
        System.out.println("ogrenciMi =" + ogrenciMi);

        char sembol = '&';
        char ch = '2';
        System.out.println("sembol =" + sembol);
        System.out.println("ch =" + ch);

        double a=0.2 , b=0.3;

        long populationWord=70000000000L;
        long x=1234;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("populationWord = " + populationWord);
        System.out.println("x = " + x);


    }

}
