package j100_CodeChallange.project02;

import java.util.Scanner;

public class Task04_TopZıplamaMesafeSaysı {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    static double topunToplamYolu = 0;
    static int yereVurmaSayisi = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double yukseklik = 0.0;
        System.out.print("topun birakildigi ilk yuksekligi  giriniz : ");
        yukseklik = scan.nextDouble();

        topZipla(yukseklik);


    }

    private static void topZipla(double yukseklik) {





        if (yukseklik >= 1) {
            topunToplamYolu+=yukseklik;
            yereVurmaSayisi++;
            yukseklik=(yukseklik*0.75);
            topunToplamYolu+=yukseklik;
            topZipla(yukseklik);

        }else {
            System.out.println("Topun toplam yolu ="+topunToplamYolu);
            System.out.println("yereVurmaSayisi = " + yereVurmaSayisi);
        }

    }
}
