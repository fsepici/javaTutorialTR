package j100_CodeChallange.Challange05;

import java.util.Scanner;

public class Q06_MetCreationForLoop {
    /* Interview Question
    Write a Java program to reverse a string.
    Use for loop and create a method called reverseString */


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String metin= scan.nextLine();

        for (int i =metin.length()-1; i >=0; i--) {
            System.out.print(metin.charAt(i));

        }
    }

}
