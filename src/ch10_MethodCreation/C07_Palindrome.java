package ch10_MethodCreation;

import java.util.Scanner;

public class C07_Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String veri = scan.nextLine();

        palindrome(veri);
    }

    private static void palindrome(String kelime) {
        String ters="";

        for (int i = kelime.length()-1; i >=0; i--) {

            ters+=kelime.charAt(i);

        }
        System.out.println("girdiğin metnin tersi = "+ters);

        if (ters.equalsIgnoreCase(kelime)){
            System.out.println("bu kelime palindromdur");
        }else
        System.out.println("bu kelime polindrome değildir");


    }


}
