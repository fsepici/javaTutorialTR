package ch10_MethodCreation;

import java.util.Scanner;

public class Task_Ucus_SwitchMethod {

    static Scanner input = new Scanner(System.in);

    static int yol = 0;
    static double yas = 0;
    static double yon = 0;
    static String yonBelirt;
    public static void rota() {


        Scanner input = new Scanner(System.in);

        System.out.println("JAVA HAVAYOLLARINA HOŞGELDİNİZ.\nB  C  D  rotalarından hangisine gideceksiniz ?");
        String secimRota = input.next().toUpperCase();

        switch (secimRota) {
            case "B":
                yol = 500;
                yonBelirt="  B yönlü >>>";
                break;
            case "C":
                yol = 700;
                yonBelirt="  C yönlü >>>";
                break;
            case "D":
                yol = 900;
                yonBelirt="  D yönlü >>>";
                break;
            default:
                System.out.println("yanlış bir seçim yaptınız");
                rota();
                break;
        }
    }

    public static void yasSecim() {


        System.out.println("Yaşınız 12 den küçük ise 1 i\n12 ile 24 arası ise  2 yi \n24 ile 65 arası ise  3 ü" +
                "\n65 üstü ise 4 ü\n******* tuşlayınız ******");
        int secimYas = input.nextInt();
        switch (secimYas) {
            case 1:
                yas = 0.5;
                break;
            case 2:
                yas = 0.9;
                break;
            case 3:
                yas = 1;
                break;
            case 4:
                yas = 0.7;
                break;
            default:
                System.out.println("yanlış bir seçim yaptınız");
                yasSecim();
                break;

        }
    }


    public static void yon() {


        System.out.println("Gidiş--Dönüş biletlerde % 20 indirim yapılmaktadır");
        System.out.println("Uçuşunuz tek yön ise 1 i\ngidiş-dönüş ise  2 yi \n******* tuşlayınız ******");
        int secimYon = input.nextInt();

        switch (secimYon) {
            case 1:
                yon = 1;
                System.out.print("Gidiş >>>");
                break;
            case 2:
                yon = (2 * 0.8);
                System.out.print("Gidiş--Dönüş (% 20 indirimli) >>>");
                break;
            default:
                System.out.println("yanlış bir seçim yaptınız");
                yon();
                break;

        }

    }


}
