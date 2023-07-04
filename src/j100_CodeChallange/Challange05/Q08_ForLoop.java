package j100_CodeChallange.Challange05;

import java.util.Scanner;

public class Q08_ForLoop {

    // Kullanicidan iki sayi isteyin.
    // Girilen sayilar ve aralarindaki tum
    // tamsayilari toplayip, sonucu yazdiran bir program yaziniz

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz");
        int a = scan.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int b = scan.nextInt();
        int toplam = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                toplam += i;
                
            }
            System.out.println("toplam = " + toplam);
        } else if (b<a) {
            for (int i = b; i <= a; i++) {
                toplam += i;
            }
            System.out.println("toplam = " + toplam);
        } else if (a == b){
                System.out.println("toplam = " + (a+b));
            }

    }


}
