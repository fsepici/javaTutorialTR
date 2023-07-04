package j100_CodeChallange.project;

import java.util.Random;
import java.util.Scanner;

/*
Sayı tahmin etme oyunu....
Bilgisayardan rastle(random class kullanılarak) 0-100 arasında bir sayı alıp kullanıcının
tahminini her defasından büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan code create ediniz .
*/
public class SayiTahminEtmeOyunu {


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();
        System.out.println("*** Tahmin Oyununa Hoşgeldiniz ***\n1-100 arası bir sayı giriniz");
        int pcSayi=rnd.nextInt(100);
        System.out.println("pcSayi = " + pcSayi);
        int sayiTahmin=scan.nextInt();

        System.out.println("pcSayi = " + pcSayi);
        if (sayiTahmin<100 && sayiTahmin>0){
            while (sayiTahmin!=pcSayi){
                if (sayiTahmin<pcSayi){
                    System.out.println("sayıyı arttır");
                    sayiTahmin=scan.nextInt();
                } else if (sayiTahmin>pcSayi) {
                    System.out.println("sayıyı azalt");
                    sayiTahmin=scan.nextInt();
                }else System.out.println("sayıyı buldunuz");

            }System.out.println("sayıyı buldunuz");


        }else System.out.println("doğru bir giriş yapmalısınız");





    }
}

