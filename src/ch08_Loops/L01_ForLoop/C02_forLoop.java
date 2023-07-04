package ch08_Loops.L01_ForLoop;

import java.util.Scanner;

public class C02_forLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("pozitif bir tam sayı yazdır");
        int sayi = scan.nextInt();

        if (sayi <= 0) {
            System.out.println("pozitif sayı gir");

        } else {
            for (int i = sayi; i < 100; i++) {
                if (i % 4 == 0) {
                    System.out.print(i + " , ");
                }
            }
             if (sayi>100){
                System.out.println("pozitif sayı gir");
            }
        }
    }
}