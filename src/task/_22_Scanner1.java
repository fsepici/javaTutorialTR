package task;

import java.util.Scanner;

public class _22_Scanner1 {
    public static void main(String[] args) {

        System.out.println("İsminizi Giriniz:");
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        System.out.println("name = " + name);


    }
}