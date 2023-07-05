package j100_CodeChallange.InterviewQuestions;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /* Task->
     * Girilen  Stringin ilk ve son harfini yine girilen  sayi kadar
     * return eden metod create ediniz.
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("birşeyler çiziktiresen");
        String biseyler = scan.nextLine();
        System.out.println("tekrar sayısını girin");
        int sayi = scan.nextInt();
        System.out.println("method(biseyler, sayi) = " + method(biseyler, sayi));
    }

    private static String method(String str, int tekrarSayisi) {
        String output = "";
        for (int i = 1; i <= tekrarSayisi; i++) {


            output += str.substring(0, 1) + str.substring(str.length() - 1);
        }
        return output;
    }


}
