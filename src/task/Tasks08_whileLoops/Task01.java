package task.Tasks08_whileLoops;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prnt eden code create ediniz.
 */
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int count=0;


        while (toplam <= 333) {
            System.out.println("Toplanacak sayı giriniz=");
            int sayi= scan.nextInt();
            toplam+=sayi;
            count++;

        }
        System.out.println("Girilen sayı adedi = "+count);
        System.out.println("Toplam 333 ü geçti...toplam= "+toplam);

    }
}
