package task.Tasks08_whileLoops;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */
        Scanner scan=new Scanner(System.in);

        int sayi=1;
        int count=0;
        int toplam=0;
        while ( sayi != 0){
            System.out.println("Bir sayı giriniz");
            sayi= scan.nextInt();
            count++;
            toplam+=sayi;
        }
        System.out.println("Girilen sayı adedi = "+count);
        System.out.println("toplam = " + toplam);

    }
}
