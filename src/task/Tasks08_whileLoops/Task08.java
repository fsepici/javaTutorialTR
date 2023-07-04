package task.Tasks08_whileLoops;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        //	Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        //	ve “Negatif sayi giremezsiniz” yazdirip basa donun
        //	Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        //	yanlislikla kac negative sayi girdigini
        //	ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
        Scanner scan = new Scanner(System.in);
        int veri = 1;
        int countn=0;
        int countp=0;
        int toplam=0;

        while (veri != 0) {
            System.out.println("Toplama işlemi yapacaksınız.çıkmak için 0 ' ı tuşlayınız");
            System.out.println("Bir sayı giriniz =");
            veri = scan.nextInt();
            if (veri < 0) {
                System.out.println("Negatif sayi giremezsiniz");
                countn++;
            }else if (veri>0) {
                countp++;
                toplam+=veri;

            }

            }
        System.out.println("Toplam "+countp+" tane pozitif sayı girdiniz");
        System.out.println("Girdiğiniz bu sayıların toplamı = "+toplam);
        System.out.println("Not: Yanlışlıkla "+countn+" adet negatif sayı girdiniz.");
        }
    }
