package ch09_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("doğal sayı gir");
        int sayi = scan.nextInt();

        for (int i = 2; i < sayi; i++) {
            if (sayi % i != 0) {
                System.out.println(sayi + "asal");

            }

        }

    }
}
