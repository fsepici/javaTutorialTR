package task.tasks10;

import java.util.Scanner;

public class Odev02 {

    static String veri;


    public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method
		create ediniz
		 */

        rakamSay();

    }

    public static void rakamSay() {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("bir veri giriniz");
        veri = scan.nextLine();
        for (int i = 0; i < veri.length(); i++) {

            if (Character.isDigit(veri.charAt(i))) {
                count++;
            }

        }
        System.out.println("Girilen verideki rakam sayısı =" + count);


    }
}