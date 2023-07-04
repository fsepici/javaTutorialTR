package j100_CodeChallange.Challange05;

import java.util.Scanner;

public class Q05_NestedForLoop {
    /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Satır satısı gir =");
        int satir = scan.nextInt();
        System.out.println("Sutun sayısı giriniz =");
        int sutun = scan.nextInt();

        for (int i = 0; i < satir; i++) {
            System.out.print("*");
            for (int j = 0; j < sutun; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }


}
