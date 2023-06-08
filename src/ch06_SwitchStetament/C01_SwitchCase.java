package ch06_SwitchStetament;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {

        System.out.println("0 veya 1 veya 2 giriniz");
        Scanner scan = new Scanner(System.in);
        int rakam = scan.nextInt();


        if (rakam == 0) {
            System.out.println("sıfır");
        } else if (rakam == 1) {

            System.out.println("bir");
        } else if (rakam == 2) {
            System.out.println("iki");
        }

        System.out.println("" +
                "switch ile çalışan kod");

        switch (rakam) {
            case 0:
                System.out.println("sıfır");
                break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            default:
                System.out.println("0 ile 2 arasında bir rakam giriniz");
                break;
        }

        System.out.println("ana menü için A \nürün göstermek için B \neklemek için C \nçıkış için Q ya basınız");
        String islem=scan.next().toUpperCase();

        switch (islem) {
            case "A" :
                System.out.println("Ana menüye hoşgeldin");
                break;
            case "B" :
                System.out.println("Hangi ürünleri görmek istersin");
                break;
            case "C" :
                System.out.println("Hangi ürünleri eklemek istersin");
                break;
            case "Q" :
                System.out.println("Çıkış işlemleriniz yapılıyor");
                break;
            default:
                System.out.println("yanlış bir tuşlama yaptınız");
                break;
        }


        }

}
