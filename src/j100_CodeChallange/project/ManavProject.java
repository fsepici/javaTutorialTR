package j100_CodeChallange.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ManavProject {


static ArrayList<String> urunListesi=new ArrayList<>(Arrays.asList("Domates","Biber","Patlıcan","avakado","muz"));
static ArrayList<Double> urunFiyatListesi=new ArrayList<>(Arrays.asList(8.5,10.3,13.2,35.7,23.8));
static double toplamodenecekMiktar=0;

static Scanner scan=new Scanner(System.in);



    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */

musteriSecim();
    }

    private static void musteriSecim() {

        System.out.println("Ne vereyim abime =");
        int secim = scan.nextInt();
        if (secim < 6 && secim > 0) {

            System.out.println("kaç kg istersiniz? =");
            int kg = scan.nextInt();

            toplamodenecekMiktar += (kg * urunFiyatListesi.get(secim - 1));
            System.out.println(urunListesi.get(secim - 1) + " den " + kg + " kg aldınız.");
            System.out.println("Başka bir ürün istermisiniz? devam etmek için 1 KASA için 2 giriniz");
            int karar = scan.nextInt();
            if (karar == 1) {
                musteriSecim();
            } else if (karar == 2) {
                kasa();
            } else System.out.println("yanlış bir giriş yaptınız");


        } else System.out.println("yanlış bir giriş yaptınız");
        musteriSecim();
    }
    private static void kasa() {
        System.out.println("toplam ödeyeceğiniz miktar="+toplamodenecekMiktar);
    }


}