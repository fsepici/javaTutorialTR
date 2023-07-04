package ch09_Break_Continue;

import java.util.Scanner;

public class C07_Task {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir şey giriniz");
        String mail=scan.nextLine();
        int sayi=0;

        for (int i = 0; i <mail.length() ; i++) {
            if (mail.charAt(i)=='c'){
                break;
            }else if (mail.charAt(i)=='a')
                sayi++;

        }
        System.out.println("a karakter sayısı ="+sayi);

/*



*/
    }
}
