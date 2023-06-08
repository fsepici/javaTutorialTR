package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        System.out.print("Bir sayı giriniz =");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        if (sayi < 0) {
            System.out.println("Girilen sayı negatiftir");
        }else if (sayi == 0) {
                System.out.println("Girilen sayı sıfırdır");
        } else {
                System.out.println("Girilen sayı pozitiftir");
        }
        }
    }

