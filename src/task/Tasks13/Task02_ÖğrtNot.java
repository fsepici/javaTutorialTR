package task.Tasks13;


import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task02_ÖğrtNot {
    public static void main(String[] args) {
          /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Kaç adet not girmek istiyorsunuz ?");
        int notSayisi = scan.nextInt();
        int i = 0;
        int toplam = 0;
        int[] notlar = new int[notSayisi];

        while (i < notSayisi) {
            System.out.println((i + 1) + ". öğrencinin notu =");
            notlar[i] = scan.nextInt();
            toplam += notlar[i];
            i++;
        }
        double ort = toplam / notSayisi;
        System.out.println("ort = " + ort);

        int count = 0;
        for (int j = 0; j < notSayisi; j++) {
            if (notlar[j] > ort) {
                count++;
            }

        }

        System.out.println("Ortalamayı geçen öğrenci sayısı =" + count);


    }
}
