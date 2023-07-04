package ch08_Loops.L03_DoWhileLoop;

import java.util.Scanner;

public class C02_doWhileLoop {
    public static void main(String[] args) {
        //task-> girilen sayı 17 den kucuk ise "kazandınız" print eden  değilse ise sayı girişi isteyen
//  code create ediniz...

        Scanner scan=new Scanner(System.in);

int a;
        do {
            System.out.println("bir tam sayı giriniz");
             a= scan.nextInt();

        }while (a>=17); {
            System.out.println("kazandınız");

        }



    }
}
