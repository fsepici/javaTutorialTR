package j100_CodeChallange.Challange07;

import java.util.Scanner;

public class Task02 {

    // task-> girilen tamsayının tek-çift olmasını kontrol eden method create ediniz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = scan.nextInt();

        System.out.println("tekMi(sayi) = " + tekMi(sayi));


    }

    private static boolean tekMi(int sayi) {


        return  sayi%2!=0? true:false;


    }

}




