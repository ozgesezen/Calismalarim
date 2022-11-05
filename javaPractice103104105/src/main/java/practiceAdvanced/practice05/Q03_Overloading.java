package practiceAdvanced.practice05;

public class Q03_Overloading {
    //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir method oluşturunuz.(Method overloading kullanınız
    public static void main(String[] args) {

        Hacim hacim = new Hacim();
        int karePrizma = hacim.hacimHesapla(5);
        System.out.println(karePrizma);
        hacim.hacimHesapla(5,3);
        hacim.hacimHesapla(6,5,4);

    }

}
