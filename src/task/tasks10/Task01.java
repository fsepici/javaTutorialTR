package task.tasks10;

import java.util.Scanner;

public class Task01 {
    static Scanner scan = new Scanner(System.in);
    static Integer sayi1, sayi2;

    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini kontrol eden method create ediniz...

        esitMi();


    }//main sonu

    public static void esitMi() {
        System.out.print("Bir sayı giriniz = ");
        sayi1 = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz = ");
        sayi2 = scan.nextInt();
        if (sayi1.equals(sayi2)){
            System.out.println("Girilen sayılar eşittir");
        }else {
            System.out.println("Girilen sayıslar eşit değildir");
        }


    }


}
