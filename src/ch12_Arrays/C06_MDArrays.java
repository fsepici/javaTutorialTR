package ch12_Arrays;

import java.util.Arrays;

public class C06_MDArrays {
    public static void main(String[] args) {

        int [][]arr1=new int[3][5];

        System.out.println("Arrays.deepToString(arr1) = " + Arrays.deepToString(arr1));

        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));

        int [][][]arr2=new int[2][3][4];
        System.out.println("Arrays.deepToString(arr2) = " + Arrays.deepToString(arr2));

        int sinif21[][] = new int[5][21];
        int sinif24[][] = new int[3][24];



        arr1[0][3]=35;
        System.out.println("Arrays.deepToString(arr1) = " + Arrays.deepToString(arr1));


        System.out.println("arr1[0][3] = " + arr1[0][3]);

        int [][] mdArr={{1,2,3},{10,20},{103}};
        System.out.println("mdArr.length = " + mdArr.length);

        System.out.println("mdArr[2][0] = " + mdArr[mdArr.length-1][mdArr[mdArr.length-1].length-1]);


    }
}
