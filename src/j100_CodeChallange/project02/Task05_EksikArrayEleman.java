package j100_CodeChallange.project02;

public class Task05_EksikArrayEleman {
    /*
    Task-> 1 den 10 a kadar sayılar oluşan dizide eksik olan sayıyı return eden  metod create ediniz..

     ([1, 2, 3, 5, 6, 7, 8, 10,9]) ➞ 4
    ([7, 2, 3, 10, 5, 9, 1, 4, 8]) ➞ 6
    ([7, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 10

     */

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6, 7, 8, 10, 9};
        int[] arr1 = {7, 2, 3, 10, 5, 9, 1, 4, 8};
        int[] arr2 = {7, 5, 1, 2, 4, 6, 8, 3, 9};
        int[] arr3 = {7, 5, 10, 2, 4, 6, 8, 3, 9};
        System.out.println("eksikElelmanBul(arr) = " + eksikElelmanBul(arr));// 4
        System.out.println("eksikElelmanBul(arr1) = " + eksikElelmanBul(arr1));// 6
        System.out.println("eksikElelmanBul(arr2) = " + eksikElelmanBul(arr2));// 10
        System.out.println("eksikElelmanBul(arr3) = " + eksikElelmanBul(arr3));// 1

    }


    private static int eksikElelmanBul(int[] arr) {
        int arrToplam=0;
        for (int i = 0; i < arr.length; i++) {
            arrToplam+=arr[i];
        }
        return 55-arrToplam;
    }
}

