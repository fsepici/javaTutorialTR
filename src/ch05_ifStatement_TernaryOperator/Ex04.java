package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        /*
 TASK -> girilen bir ifadenin ilk karakterinin harf  olup olmadığını  kontrol eden code create ediniz..

*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir ifade giriniz");

        char ilkkarakter =scanner.next().charAt(0);

        if (ilkkarakter>= 'A' && ilkkarakter <= 'Z' || ilkkarakter>='a' && ilkkarakter <='z'){
            System.out.println("Girilen ifadenin ilk karaktesi harftir. " + ilkkarakter);
        }
        else System.out.println("Girilen ifadenin ilk karakteri harf değildir." + ilkkarakter);




    }
}
