package ch06_SwitchStetament;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        // girilen ayın hangi mevsimde oldugunu print eden code create ediniz...
        Scanner scan=new Scanner(System.in);
        System.out.println("bir ay nosu giriniz");
        int ay = scan.nextInt();
        switch (ay) {
            case 6, 7, 8:
                System.out.println(" Yaz Mevsimi");
                break;
            case 9, 10, 11:
                System.out.println(" Sonbahar Mevsimi");
                break;
            case 12, 1, 2:
                System.out.println(" Kış Mevsimi");
                break;
            case 3, 4, 5:
                System.out.println(" İlkbahar Mevsimi");
                break;
            default:
                System.out.println("Güneş takviminde 12 ay vardır");
                break;
        }
    }
}
