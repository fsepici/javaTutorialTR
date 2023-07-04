package ch14_ForEachLoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

/* TASK :
Bir öğretmenden girmek istediği kadar notu alınız, ve
ortalamayı geçen öğrenci sayısını bulan code create ediniz.

*/

        List<Integer> listNotlar = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        String devamMi;

        do {
            System.out.println("istediğin kadar not gir");
            int orgnNot = scan.nextInt();
            System.out.println("Devam edeceksen (E)  devam etmek istemiyorsan (H)  ye bas");
            devamMi = scan.next();
            listNotlar.add(orgnNot);
        } while (devamMi.equalsIgnoreCase("E"));

        Collections.sort(listNotlar);
        System.out.println("listNotlar = " + listNotlar);

        int notlarToplam=0;
        for (int w:listNotlar) {
            notlarToplam+=w;

        }

        double ort=notlarToplam/listNotlar.size();

        System.out.println("ort = " + ort);

    }
}
