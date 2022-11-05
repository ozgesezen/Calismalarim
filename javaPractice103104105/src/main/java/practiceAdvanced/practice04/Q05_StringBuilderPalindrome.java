package practiceAdvanced.practice04;

public class Q05_StringBuilderPalindrome {

    //Bir string degerin palindrome olup olmadigini kontrol eden bir kod yaziniz

    public static void main(String[] args) {

        String str = "ali";
        String strReverse = "";

        for (int i=str.length()-1;i>-1;i--){
            strReverse += str.charAt(i);
        }
        System.out.println(strReverse);

        if (str.equalsIgnoreCase(strReverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Palindrome degil");
        }

        String str1 = "nazan1";
        StringBuilder stb = new StringBuilder(str1);
        String stbreverse = String.valueOf(stb.reverse());
        System.out.println(stb);

        if (str1.equals(stbreverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Palindrome degil");
        }

    }

}
