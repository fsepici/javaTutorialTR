package ch10_MethodCreation;

import java.util.Scanner;

public class C03_MethodCreation {
    public static void main(String[] args) {

// task-> girilen tam sayının rakamları toplamını print eden METHOD create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = scan.nextInt();
        System.out.println("rakamlaritopla(sayi) = " + rakamlaritopla(sayi));


    }

    public static int rakamlaritopla (int x) {
        int toplam = 0;
        while (x > 0) {
            toplam += x % 10;
            x /= 10;

        }
        return toplam;


    }
}
