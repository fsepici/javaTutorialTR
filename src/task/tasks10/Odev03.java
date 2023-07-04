package task.tasks10;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
    public static void main(String[] args) {

        asalMi();


    }

    public static void asalMi() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz =");
        int sayi = scan.nextInt();

        boolean asal = true;
        for (int i = 2; i < sayi; i++) {
            while (sayi % i == 0) {
                asal = false;
                break;

            }

        }

        if (sayi==1) {
            System.out.println("asal değil");
        }
        else if (asal) {
            System.out.println("asal");
        }
         else {
            System.out.println("asal değil");


        }


    }
}
