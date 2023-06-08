package ch05_ifStatement_TernaryOperator;

import java.util.Objects;
import java.util.Scanner;

public class C06_NestedTernaryOperator {
    public static void main(String[] args) {


 /*
 TASK :
Kullanicidan bir sayi aliniz
Sayi 0 dan buyuk esit ise //nester burada devereye giriyor
10 dan kucuk olup olmadigini kontrol ediniz.

10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.

Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
 */


        System.out.print("Bir sayı giriniz =");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();

        String result = sayi >= 0 ? (sayi < 10 ? "Rakam" : "Pozitif tam sayi") : "Negatif tam sayi";
        System.out.println("result = " + result);


    }
}
