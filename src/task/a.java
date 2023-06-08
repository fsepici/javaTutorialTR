package task;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Ay ismi giriniz");

        String ay=scan.nextLine().toUpperCase();
        System.out.println("Ay = " + ay);

        switch (ay) {
            case "OCAK":
            case "MART":
            case "MAYIS":
            case "TEMMUZ":
            case "AĞUSTOS":
            case "EKİM":
            case "ARALIK":
                System.out.println("Girdiğiniz ay 31 gün içerir");
                break;
            case "NİSAN":
            case "HAZİRAN":
            case "EYLÜL":
            case "KASIM":
                System.out.println("Girdiğiniz ay 30 gün içerir");
                break;
            default:
                System.out.println("Ay ismini yanlış yazdınız");
                break;


        }
    }
}
