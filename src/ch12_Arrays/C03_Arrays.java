package ch12_Arrays;

import java.util.Arrays;

public class C03_Arrays {

    public static void main(String[] args) {

        String str = " tam oturmasi icin birkac ornek daha gerekir  ";
        String[] yeniArr = str.trim().split(" ");
        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));

        int karaktersay = 0;
        int harfsay=0;
        String [] yeniArr2 = str.split("");
        for (int i = 0; i <yeniArr2.length ; i++) {
       //      if (Character.isLetter(yeniArr2[i])) harfsay++;
        }
        System.out.println("harfsay = " + harfsay);

    }

}
