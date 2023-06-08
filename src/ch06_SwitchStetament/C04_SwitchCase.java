package ch06_SwitchStetament;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Artık yılda mısınız?: E veya H");
        String artik = scan.next().toLowerCase();

        System.out.println("bir ay nosu giriniz");
        int ay = scan.nextInt();

        switch (ay) {
            default:
                System.out.println("Güneş takviminde 12 ay vardır");
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girdiğiniz ay 31 gün içerir");
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girdiğiniz ay 30 gün içerir");
                break;
            /*case 2:
                System.out.println("yılını gir");
                int yil=scan.nextInt();

                if ((8yil % 4==0 && yil % 100!=0) || yil % 400 ==0)
*/

        }

    }
}