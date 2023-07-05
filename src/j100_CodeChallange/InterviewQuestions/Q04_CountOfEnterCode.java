package j100_CodeChallange.InterviewQuestions;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
    //  Task-> STRING OLAN PIN kodunu 3 seferde  kontrol eden code create ediniz.

    public static void main(String[] args) {
        String pin = "seda123";
        int girisHakki = 3;
        Scanner scan = new Scanner(System.in);
        while (girisHakki > 0) {
            girisHakki--;
            System.out.println("şifrenizi giriniz");
            String sifre = scan.nextLine();
            if (sifre.equals(pin)) {
                System.out.println("giriş yapıldı");
                break;
            } else {
                System.out.println("yanlış giriş yaptınız...kalan giriş hakkınız =" + girisHakki);
            }
            if (girisHakki == 0) {
                System.out.println("pin bloke");
            }


        }

    }
}