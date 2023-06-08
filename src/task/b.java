package task;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print(" bir cümle  giriniz : ");

        String cumle = input.nextLine().toLowerCase();

        if (cumle.indexOf("java") == -1) {
            System.out.println("Girilen cumle java icermiyor");
        } else if (cumle.indexOf("java") == cumle.lastIndexOf("java")) {
            System.out.println("Girilen cumle 1 tane java iceriyor");
        } else System.out.println("Girilen cumlede birden fazla java var");
    }
}