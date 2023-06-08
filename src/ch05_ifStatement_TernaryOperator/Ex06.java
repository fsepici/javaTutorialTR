package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
                kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz...

         */
        System.out.print("Cinsiyetinizi giriniz E veya K =");
        Scanner scan = new Scanner(System.in);
        String cinsiyet = scan.next().toUpperCase();

        System.out.print("Yaşınızı giriniz =");
        int yas = scan.nextInt();

        System.out.print("Pirim gün sayısını giriniz =");
        int pirimg = scan.nextInt();
        if (cinsiyet != "E") {
            if (yas > 65 && pirimg > 7000) {
                System.out.println("Emekli olabilirsiniz");
            }else
            System.out.println("Emekli olmanıza " + (65 - yas) + " yıl ve " + (7000 - pirimg) + " pirim günü kalmıştır.");
        } else if (cinsiyet != "K") {
            if (yas > 60 && pirimg > 6000) {
                System.out.println("Emekli olabilirsiniz");
            }else
            System.out.println("Emekli olmanıza " + (60 - yas) + " yıl ve " + (6000 - pirimg) + " pirim günü kalmıştır.");

        }

    }
}
