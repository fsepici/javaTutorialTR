package j100_CodeChallange.Challange07;

import java.util.Scanner;

public class Task01 {
    /* Task->
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod create ediniz.
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir veri giriniz");
        String str = input.nextLine();
if (str.length()>3) {
    System.out.println("xyzVarMi(str) = " + xyzVarMi(str));
    System.out.println("xyzVarMi2(str) = " + xyzVarMi2(str));
 //   System.out.println("xyzVarMi4(str) = " + xyzVarMi4(str));
}else {
    System.out.println("3 karakterden fazla giriniz");
}
    }

    public static boolean xyzVarMi(String str) {
        return str.contains("xyz") ? true : false;
    }


    public static boolean xyzVarMi2(String str) {
        if (str.contains("xyz")) {
            return true;
        } else {
            return false;
        }

  //      public static String xyzVarMi4(String str) {
   //         System.out.println("str.contains(\"xyz\") ? true : false = " + str.contains("xyz") ? true : false);
        }
    }
