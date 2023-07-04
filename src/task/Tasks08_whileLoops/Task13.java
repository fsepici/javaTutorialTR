package task.Tasks08_whileLoops;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */
        Scanner scan = new Scanner(System.in);


        String veri;
        do {
            System.out.println("bir karakter giriniz");
            veri = scan.nextLine();
            if (!veri.equals("x"))
            System.out.println("javaCAN");

        } while (!veri.equals("x"));

            System.out.println("jAVATAR");





    }

}


