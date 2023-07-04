package task.Tasks08_whileLoops;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.


        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi= scan.nextInt();
        int i=1;

        while (i<=sayi){
            if (i%2==1){
                System.out.print(i+" , ");
            }
            i++;
        }

    }
}
