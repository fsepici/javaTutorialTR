package ch08_Loops;

import java.util.Scanner;

public class C03_nested_forLoop {
    public static void main(String[] args) {

/*
eger bir döngünün baody'sinde başka  bir döngü bulunuyorsa bu tür döngülere nested-loop->
içiçe döngü denir
İç döngü dış döngünün her adımda tekrar çalışır.
içiçe döngülerde en içteki döngü en önce çalışır..
 */
/*
        for (int i = 0; i <5; i++) {
            for (int j = 1; j <3; j++) {
                System.out.println(i+". kat "+j+".daire");
            }

        }
*/

         /*
       Interview Question
               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari print eden ama;
           1  - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
           2  - Sayi 5’in kati ise sayi yerine "CAN'dır" yazdirin.
           3  - Sayi hem 3’un hem 5’in kati ise sayi yerine "JavaCAN" print eden code create ediniz
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("pozitif bir tam sayı yazdır");
        int sayi = scan.nextInt();

        if (sayi <= 0 || sayi>99) {
            System.out.println("Lütfen pozitif ve 100 den küçük bir sayı giriniz");

        } else {
            for (int i = 1; i < sayi; i++) {
                if (i % 5 == 0 && i % 3 == 0) {
                    System.out.print("JavaCAN ,");

                } else if (i % 5 == 0) {
                    System.out.print("CAN'dır ,");
                } else if (i % 3 == 0) {
                    System.out.print(" Java , ");
                } else System.out.print(" "+i+" , ");
            }


        }


    }
}