package task.Tasks08_whileLoops;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("İlk sayınızı giriniz");
        int a = scan.nextInt();
        System.out.println("İkinci sayınızı giriniz");
        int b = scan.nextInt();

        if (a < b - 1) {
            while (a < b - 1) {
                System.out.print((a + 1) + " ,");
                a++;
            }

        } else if (b < a - 1) {
            while (b < a - 1) {
                System.out.print((b + 1) + " ,");
                b++;
            }

        } else if (a == b || a == b + 1 || b == a + 1) {
            System.out.println("Girdiğiniz sayılar arasılda herhangi bir sayı yoktur");
        }


    }
}
