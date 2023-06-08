package ch06_SwitchStetament;

import java.util.Scanner;

public class C07_SwitchCase {

    public static void main(String[] args) {
// girilen haftanın gününü hafta içi veya sonu olduğunu print eden kod

        Scanner scan= new Scanner(System.in);
        System.out.println("gün ismi giriniz");

        String gun=scan.nextLine().toUpperCase();
        System.out.println("gün = " + gun);

        switch (gun) {
            case "PAZARTESİ":
            case "SALI":
            case "ÇARŞAMBA":
            case "PERŞEMBE":
            case "CUMA":
                System.out.println("Girdiğiniz gün Haftaiçi");
                break;
            case "CUMARTESİ":
            case "PAZAR":
                System.out.println("Girdiğiniz gün Haftasonu");
                break;
            default:
                System.out.println("Gün ismini yanlış yazdınız");
                break;






        }
    }
}
