package task.Tasks08_whileLoops;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz
        int i = 1;
        int a=0;
        Scanner scan=new Scanner(System.in);
        while (i <= 5){
            System.out.println("bir sayı giriniz =");
            int sayi= scan.nextInt();
            i++;
            if (sayi>a){
                a=sayi;
            }continue;

        }
        System.out.println("Girilen 5 adet sayı arasında en büyüğü ="+a);

    }
}
