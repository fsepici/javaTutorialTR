package ch08_Loops;

public class C05_PatternQuestion {
    public static void main(String[] args) {
 /*
A
A B
A B C
A B C D
A B C D E
A B C D E F
şeklini yazdırınız.  65=A'nın ascıı değeri

*/

        for (int i = 66; i < 72; i++) {
            for (int j = 65; j <i; j++) {
                System.out.print((char) (j)+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print((char) (65+j)+" ");
            }
            System.out.println();
        }

    }
}