package task.Tasks08_whileLoops;

import java.util.Random;
import java.util.Scanner;

public class Task06_sayiBulmaca {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        Scanner scan = new Scanner(System.in);
        Random number = new Random();
        int sayitut = number.nextInt(1, 101);
        //System.out.println("sayıtut = " + sayitut);
        int tahmin=1111;
        int count = 0;

        while (tahmin != sayitut) {
            System.out.print("Tutulan sayıyı tahmin ediniz = ");
            tahmin = scan.nextInt();
            count++;
            if (tahmin < sayitut) {
                System.out.println("********* Sayı tahmininizden daha büyük *********");
            } else if (tahmin > sayitut) {
                System.out.println("********* Sayı tahmininizden daha küçük *********");
            }


        }
        System.out.println("Tebrikler sayıyı " + count + " . tahmininizde buldunuz");

    }

}
