package task.Tasks08_whileLoops;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {


        // kullanicidan kac sayi toplamak istedigini alin
        // bu sayilari alin ve bu sayilarin toplamini ekrana yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Kaç sayı toplamak istersiniz");
        int adet=scan.nextInt();
        int i=1;
        int toplam=0;

        while (i<=adet){
            System.out.println(i+". sayıyı giriniz = ");
            int sayi= scan.nextInt();
            toplam+=sayi;
            i++;
        }
        System.out.println("toplam = " + toplam);








    }

}
