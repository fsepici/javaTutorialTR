package j100_CodeChallange.Challange02;

import java.util.Scanner;

public class Task04_IfStatement {
    public static void main(String[] args) {

        /* Task ->
         * Girilen Y/N  degerlerini
         * print eden code create ediniz..
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Seçeneklerden birini giriniz Y / N = ");
        String input=scan.nextLine().toUpperCase();

        if (input.equals("Y"))  System.out.println(input+" = YES ");  //String bir ifadede == yerine equals()  kullanılmalı
        else if (input.equals("N")) System.out.println(input + " = NO ");
        else System.out.println("Yanlış bir karakter girdiniz");


    }
}
