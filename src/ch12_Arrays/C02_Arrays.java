package ch12_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {



        //Array elemanı varlığını  kontrol etme...
//istenen sayiyi arrayda varmi yokmu kontrol ediniz

        int [] numbers= {12,13,55,66,35,3,4,34,33,63,72};

        int istenenSayi = 35;
        int i=0;

        while (i<numbers.length) {
            if (istenenSayi == numbers[i]) {
                System.out.println(istenenSayi + " sayısı Arrayda var");

            }else System.out.println(istenenSayi+" sayısı arrayda yoktur");
            i++;
        }


        Arrays.sort(numbers);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

        System.out.println("Arrays.binarySearch(numbers,istenenSayi) = " + Arrays.binarySearch(numbers, istenenSayi));

    }
}
