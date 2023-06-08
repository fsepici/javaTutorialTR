package j100_CodeChallange.Challange03;

import java.util.Scanner;

public class Task01_NestedIfStatement {
    public static void main(String[] args) {
        /* Task->
   Girilen  yas data için
	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir,
	 	print eden code create ediniz...
	 */
        Scanner scan = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz = ");
        int yas = scan.nextInt();

        if (yas >= 18) {
            if (yas >= 70) {
                System.out.println("üç kez oy kullanabilirsiniz");
            }
            if (yas >= 50 && yas < 70) {
                System.out.println("iki kez oy kullanabilirsiniz");
            }
            if (yas < 50) {
                System.out.println("bir kez oy kullanabilirsiniz");
            }
        }else
        System.out.println("malesef oy kullanamassınız");

    }


}
