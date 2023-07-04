package ch09_Break_Continue;

import java.util.Scanner;

public class C04_PinKontrol {
    public static void main(String[] args) {
        // Task -> String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.
        String pin = "pinpin";
        Scanner scan = new Scanner(System.in);
        int girisHakki = 3;

        while (true) {

            System.out.println("bir pin giriniz");
            String password = scan.nextLine();

            if (pin.equals(password)) {
                System.out.println("pin eşleşti");
            } else {
                System.out.println("şifre yanlış tekrar dene ");
                girisHakki--;
                System.out.println("kalan deneme hakkın" + girisHakki);

                if (girisHakki == 0) {
                    System.out.println("bloke oldun");
                    break;
                }


            }
        }

    }
}