package j100_CodeChallange.Challange05;

public class Q03_ForLoop {

    public static void main(String[] args) {

    /*
        Task-> java ifadesni j*a*v*a olarak print eden code create ediniz..
         */

        for (int i = 0; i < "java".length() - 1; i++) {
            System.out.print("java".charAt(i));
            System.out.print("*");// j*a*v*a*
        }
        System.out.println("java".charAt("java".length() - 1));
	/*	ForLoop
		print even numbers from 100 to 0 but do not use decrement(i--).

		     INPUT      :
		     OUTPUT  : 100 98 96 94 92 ....2 0
      */


    }


}
