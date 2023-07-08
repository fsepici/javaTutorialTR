package j100_CodeChallange.project02;

import java.util.Scanner;

public class Task01_IkininKuvvetiKontrol {
    public static void main(String[] args) {
        /* Task
        Girilen sayının 2'nin kuvveti olmasının kontrol eden PowersofTwo(num) methodu create ediniz.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("pozitif tam sayi giriniz");
        int sayi = input.nextInt();
        System.out.println("powerofTwo(sayi) = " + powerofTwo(sayi));
        powerofTwo2(sayi);

    }

    private static void powerofTwo2(int sayi) {

        if (sayi%2==0){
            sayi/=2;
            if (sayi==1){
                System.out.println("Girilen sayı ikinin kuvvetidir...");
            }else powerofTwo2(sayi);
        }else System.out.println("Girilen sayı ikinin kuvveti değildir");
    }

    private static boolean powerofTwo(int sayi) {
        boolean sonuc = false;
        for (int i = 2; i < sayi+1; i *= 2) {
            if (i == sayi) {
                sonuc = true;
                break;

            }

        }
        return sonuc;
    }
}

