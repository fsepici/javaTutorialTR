package j100_CodeChallange.project02;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
		/*
		 Task-> girilen sayıya kadar  tüm sayıların toplamını print eden METHOD create ediniz.
          Ornegin; 5, 4, 7, 0 ise 5+4+7=16

		  */


        sifirakadarTopla();

    }

    private static void sifirakadarTopla() {
        Scanner input = new Scanner(System.in);
        int toplam = 0;
        int sayi = 0;

        do {
            System.out.println("Bir sayı giriniz =");
            sayi = input.nextInt();
            toplam += sayi;

        } while (sayi != 0);
        System.out.println("toplam = " + toplam);
    }

}
