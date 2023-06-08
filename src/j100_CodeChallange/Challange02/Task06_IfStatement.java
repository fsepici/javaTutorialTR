package j100_CodeChallange.Challange02;

import java.util.Scanner;

public class Task06_IfStatement {
    public static void main(String[] args) {

/*
   Task->
   Girilen not değeri için
              A => 90 ~100
              B => 80 ~ 89
              C => 70 ~ 79
              D => 60 ~ 69
              F =>  0 ~ 59
              sartlari aralik belirterek yaziniz

     Girilen saat değeri için
	 	0 ~12 ==> good morning
		12 ~ 15 ==> good afternoon
		15 ~ 23 ==> good night
		12 ==> good noon
		print eden code create ediniz.
    */
        Scanner scan = new Scanner(System.in);
        System.out.print("Aldığınız puanı giriniz = ");
        int puan = scan.nextInt();

        if (90<=puan && puan<=100) {
            System.out.println(" A ");
        } else if (80<=puan && puan<=89) {
            System.out.println(" B ");
        } else if (70<=puan && puan<=79) {
            System.out.println(" C ");
        } else if (60<=puan && puan<=69) {
            System.out.println(" D ");
        } else if (0<=puan && puan<=59) {
            System.out.println(" F ");
        } else {
            System.out.println("Lütfen notunuz 0-100 arası değer giriniz");
        }


    }
}
