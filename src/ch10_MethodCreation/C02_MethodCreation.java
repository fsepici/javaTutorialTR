package ch10_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("1. notu gir");
        double not1= scan.nextDouble();
        System.out.println("2. notu gir");
        double not2= scan.nextDouble();
        System.out.println("3. notu gir");
        double not3= scan.nextDouble();
        System.out.println("ort(not1,not2,not3) = " + ort(not1, not2, not3));
    }


    public static double ort (double not1, double not2, double not3) {

        return (not1+not2+not3)/3;

    }


}
