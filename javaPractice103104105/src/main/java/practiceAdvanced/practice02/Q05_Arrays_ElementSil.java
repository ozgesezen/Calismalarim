package practiceAdvanced.practice02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05_Arrays_ElementSil {

    public static void main(String[] args) {

        /*
     Elementlerini kullanıcan alarak bir integer Array oluşturunuz.
     Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Array limitini giriniz");
        int limit= input.nextInt();
        int[] arr = new int[limit];
        for (int i=0; i<limit; i++){
            System.out.println("Giriniz: Indew "+i);
            arr[i] = input.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        //1.yol
        System.out.println("Silmek istediginiz index i giriniz");
        int removeIndex = input.nextInt();
        int idx = 0;
        int[] brr = new int[limit-1];
        for (int i=0; i<arr.length; i++){
            if (removeIndex!=i){
                brr[idx] = arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));

        //2.yol
        List<Integer> numberList= new ArrayList<>();
        for (int w : arr){
            numberList.add(w);
        }
        System.out.println(numberList);
        System.out.println("Silmek istediginiz elementin indexini giriniz");
        int silinecekidx = input.nextInt();
        numberList.remove(silinecekidx);//index ile siliyoruz
        System.out.println(numberList);
        System.out.println("Silmek istediginiz elementi giriniz");
        numberList.remove(numberList.indexOf(input.nextInt()));//elementin indeksini alarak siliyoruz
        System.out.println(numberList);

    }

}
