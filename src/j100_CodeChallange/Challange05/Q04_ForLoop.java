package j100_CodeChallange.Challange05;

import java.util.Scanner;

public class Q04_ForLoop {
   /*   Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	    ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	    hesaplayan kodu yazın
	    Örnek Ekran Çıktısı
	    Girilen sayı=4               1 -> 1  2-> 4  3->9
	    Kareler toplamı=14
	     */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 den büyük bir sayı giriniz =");
        int sayi = scan.nextInt();
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            int kare = i * i;
            System.out.print(i+" >> " + kare + " , ");
            toplam += kare;
            

        }
        System.out.println();
        System.out.println("toplam = " + toplam);
    }
}

