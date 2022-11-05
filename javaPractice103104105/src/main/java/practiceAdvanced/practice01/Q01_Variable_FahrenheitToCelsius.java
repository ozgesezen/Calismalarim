package practiceAdvanced.practice01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q01_Variable_FahrenheitToCelsius {

    public static void main(String[] args) {

        //Fahrenheit degeri celsius degere ceviren kodu yaziniz
        //formul: c=(f-32)*5/9

        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit degerini giriniz");
        double derece = input.nextDouble();
        double ceviri = (derece-32)*5/9;
        System.out.println(ceviri);

        NumberFormat numberFormat = new DecimalFormat(".##");
        String formattedC = numberFormat.format(ceviri);
        System.out.println(formattedC);
        double doubleC = Double.valueOf(formattedC);
        System.out.println(doubleC);


    }

}
