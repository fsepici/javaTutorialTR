package ch12_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    /*
Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
Array olusturulurken 2 seyi declare etmeliyiz:
1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
2- uzunluk (uzunluk array'in icerisne konul max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
array= tepsiye benzer..
Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
 isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
 */

    public static void main(String[] args) {

        int[] numArray = {11, 22, 333, 66, 65, 44, 88, 99, 55, 2, 44, 55, 6};

        String[] nameArray = {"rumeysa", "ahmet", "zeynep", "tommy", "ali", "ömer"};

        int[] sayiArr = new int[5];
        System.out.println("sayiArr = " + sayiArr);

        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));

        sayiArr[0] = 13;
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));

        System.out.println("sayiArr.length = " + sayiArr.length);
        System.out.println("nameArray.length = " + nameArray.length);
        System.out.println("numArray.length = " + numArray.length);


        System.out.println("nameArray [nameArray.length-1] = " + nameArray[nameArray.length - 1]);
        System.out.println("sayiArr[sayiArr.length-1] = " + sayiArr[sayiArr.length - 1]);
        System.out.println("numArray[numArray.length-1] = " + numArray[numArray.length - 1]);

        //nameArray[nameArray.length - 1] = "update";
       // System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));

        // for (int i = 0; i <numArray.length ; i+=2) {
        //    System.out.print( numArray[i]+" ");

        for (int i = 0; i < nameArray.length; i++) {
            if (nameArray[i].length() == 5) {
                System.out.print(nameArray[i] + " ");

                System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));
                System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));
                System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));


                Arrays.sort(nameArray);
                Arrays.sort(numArray);
                Arrays.sort(sayiArr);

                System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));
                System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));
                System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));


            }
        }





    }

}


