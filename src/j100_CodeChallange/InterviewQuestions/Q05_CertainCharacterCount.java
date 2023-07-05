package j100_CodeChallange.InterviewQuestions;

import java.util.Locale;
import java.util.Scanner;

public class Q05_CertainCharacterCount {
    /* Task->
     * Girilen  bir cumle ve bir harf için
     * Cumlede harfin kac kere
     * kullanildigini print eden code create ediniz.
     *  ORNEK:
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("birşeyler çiziktiresen");
        String biseyler = scan.nextLine().toLowerCase(Locale.ROOT);
        System.out.println("aradığın harfi giresen");
        char harf=scan.next().charAt(0);
        int count=0;
        for (int i = 0; i <biseyler.length(); i++) {
            if (biseyler.charAt(i)==harf){
                count++;
            }

        }
        System.out.println("Girdiğiniz "+biseyler+" in içinde aradığınız "+harf+" harten "+count+" tane var");


    }
}
