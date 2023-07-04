package j100_CodeChallange.Challange07;

import java.util.Scanner;

public class Task03 {
    /* task->
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method create ediniz.
      */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("cm  cinsinden bir uzunluk giriniz");
        double uzcm=scan.nextDouble();

        System.out.println("mConvert(uzcm) = " + mConvert(uzcm)+" metre");
        System.out.println("kmConvert(uzcm) = " + kmConvert(uzcm)+" kilometre");

    }

    private static double kmConvert(double uzcm) {

         return uzcm/100000 ;
    }

    private static double mConvert(double uzcm) {

        return  uzcm/100;


    }

}