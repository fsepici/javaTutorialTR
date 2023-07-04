package j100_CodeChallange.Challange05;

public class Q02_ForLoop {
        //Interview Question
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

    public static void main(String[] args) {

/*
        for (int i = 0; i <256 ; i++) {
            char a= (char) i;

            System.out.print(i+" ="+ a+" , " );

        }
  */
        int i=0;
        while (i<256) {
            char a= (char) i;

            System.out.print(i+" ="+ a+" , " );
            i++;
        }
    }

}
