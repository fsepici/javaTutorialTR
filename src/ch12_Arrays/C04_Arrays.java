package ch12_Arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {


        int sayi1 []={39,3,72,63,84};
        int sayi2 []={3,39,72,84,63};
        Arrays.sort(sayi1);
        Arrays.sort(sayi2);
        System.out.println("Arrays.equals(sayi1,sayi2) = " + Arrays.equals(sayi1, sayi2));

        String str=Arrays.toString(sayi1);
        System.out.println("str = " + str);

        System.out.println("str.substring(3) = " + str.substring(5));


    }
}
