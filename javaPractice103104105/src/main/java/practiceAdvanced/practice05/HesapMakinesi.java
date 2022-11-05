package practiceAdvanced.practice05;

public class HesapMakinesi {

    public void toplama(int...a){
        int toplam = 0;
        for (int w :a){
            toplam += w;
        }
        System.out.println("toplam = " + toplam);
    }

    public void cikarma(int a, int b){
        System.out.println("Fark= "+(a-b));
    }

    public void carpma(int...a){
        int carp = 1;
        for (int w : a){
            carp*=w;
        }
        System.out.println("Carpim= "+carp);
    }

    public void bolme(int a, int b){
        if (b==0){
            System.out.println("Bolen sayi 0 olamaz");
        }else {
            System.out.println("Bolme= " + a / b);
        }
    }

}
