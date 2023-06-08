package j100_CodeChallange.Challange02;

import java.util.Scanner;

public class Task07_IfStatemen {
    public static void main(String[] args) {
        /*

		task->
		Kullanicinın  yas ve kilo bilgileri için
		18 yasindan kucuk ise kan bagisi yapamaz.
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 ve 50 kilodan agir ise kan bagisi yapabilir.
		print eden code create ediniz.

		 */
        Scanner scan = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz = ");
        int yas = scan.nextInt();
        System.out.print("Kilonuzu giriniz = ");
        int kilo = scan.nextInt();

        if (yas < 18) {
            System.out.println("Kan bağışı yapamazsınız");
        }
        if (yas >= 18 && kilo < 50) {
            System.out.println("Kan bağışı yapamazsınız");
        }

        if (yas >= 18 && kilo >= 50) {
            System.out.println("Kan bağışı yapabilirsiniz");

        }

    }

}
