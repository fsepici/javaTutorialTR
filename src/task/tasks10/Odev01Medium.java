package task.tasks10;

import java.util.Random;
import java.util.Scanner;

public class Odev01Medium {
    /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum),
    aksi taktirde cevap yanlış olur.
     */
    static int max;
    static Scanner scan=new Scanner(System.in);
    static Random number = new Random();


    public static void main(String[] args) {

        randomNum(max );
    }

    public static void randomNum(int max) {

        System.out.print("0 dan kaça kadar random bir değer istersiniz ? =");
        max = scan.nextInt();
        int randomNum=number.nextInt(max);
        System.out.println("randomNum = " +randomNum);



    }
}
