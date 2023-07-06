package j100_CodeChallange.InterviewQuestions;

import java.util.Scanner;

public class Q07_IsDigit {
      /* Task->
     Create a method that accepts a String as parameter and finds the sum of digits in that String.
     girilen bir stringdeki rakam değerlerinin toplamını return eden method create ediniz.
     Example:
     input : J4\/4 1$ 34$¥
     output : 16

     Hint:
     Character.isDigit()
     Integer.valueOf()
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("birşeyler çiziktiresen");
        String bisey = scan.nextLine();


        System.out.println("sumOfDigit(bisey) = " + sumOfDigit(bisey));

    }

    private static int sumOfDigit(String str) {

        int toplam=0;

        for (int i = 0; i <str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                toplam+=Character.getNumericValue(str.charAt(i));
            }

        }


        return toplam ;


    }


}
