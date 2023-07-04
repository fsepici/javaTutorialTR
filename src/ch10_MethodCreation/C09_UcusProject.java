package ch10_MethodCreation;

import java.util.Scanner;

public class C09_UcusProject {

/*
A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
Bilet tarifesi:
km birim fiyati : 0.10$

yolcu 12 yasindan kucukse toplam fiyat %50 indirim,

12 ve 24 yas arasindaysa 10% indirim,

65 yasindan buyukse 30% indirim,

bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
 */

    static Scanner input = new Scanner(System.in);
    static double fiyatB = 500 * 0.1;
    static double fiyatC = 700 * 0.1;
    static double fiyatD = 900 * 0.1;

    public static void main(String[] args) {

        System.out.println("JAVA HAVAYOLLARINA HOŞGELDİNİZ.\nB  C  D  rotalarından hangisine gidecelsiniz");
        String rota = input.next().toUpperCase();

        System.out.println("gidiş dönüş indirimli alabilirsiniz\ntek yön için 1 \ngidiş-dönüş için 2 ye basınız");
        int ucusYonu = input.nextInt();
        System.out.println("yaşınızı giriniz");
        int yas = input.nextInt();

        if (rota.equals("B") || rota.equals("C") || rota.equals("D")) {

            if (rota.equals("B")) {
                if (ucusYonu == 2) {
                    System.out.println("**** fiyat hesaplanıyor ****");
                    System.out.println("65 yas üstü B rotasına  gidiş dönüş fiyatı" + fiyatB * 0.8 * 0.7 * 2 + " $");
                } else if (ucusYonu == 1) {
                    System.out.println("**** fiyat hesaplanıyor ****");
                    System.out.println("65 yas üstü B rotasına  gidiş  fiyatı" + fiyatB * 0.7 + " $");

                } else System.out.println("yanlış bir seçim yaptınız");
            } else if (rota.equals("C")) {
                if (ucusYonu == 2) {
                    System.out.println("**** fiyat hesaplanıyor ****");
                    System.out.println("65 yas üstü C rotasına  gidiş dönüş fiyatı" + fiyatC * 0.8 * 0.7 * 2 + " $");
                } else if (ucusYonu == 1) {
                    System.out.println("**** fiyat hesaplanıyor ****");
                    System.out.println("65 yas üstü C rotasına  gidiş  fiyatı" + fiyatC * 0.7 + " $");

                } else System.out.println("yanlış bir seçim yaptınız");

            } else if (rota.equals("D")) {
                if (ucusYonu == 2) {
                    System.out.println("**** fiyat hesaplanıyor ****");
                    System.out.println("65 yas üstü D rotasına  gidiş dönüş fiyatı" + fiyatD * 0.8 * 0.7 * 2 + " $");
                } else if (ucusYonu == 1) {
                    System.out.println("**** fiyat hesaplanıyor ****");
                    System.out.println("65 yas üstü D rotasına  gidiş  fiyatı" + fiyatD * 0.7 + " $");

                } else System.out.println("yanlış bir seçim yaptınız");

            }


        }

    }


}
