package task.tasks10;

import java.util.Locale;
import java.util.Scanner;

public class Task02 {
    static Scanner scan = new Scanner(System.in);

    static String isim,isim2, adSoyad;
    static int boslukSay = 0;

    public static void main(String[] args) {
        //task -> girilen ad ve soyadın ilk harfleri buyuk diğerlerini kucuk yapan method create ediniz

        adSoyad();

    }

    public static void adSoyad() {
        System.out.println("Ad Soyad girişi yapınız");
        isim = scan.nextLine();


        for (int i = 0; i < isim.length(); i++) {
            if (isim.charAt(i) == ' ') {
                boslukSay++;
            }
        }
        if (boslukSay == 0) {
            adSoyad = isim.toUpperCase().charAt(0) + isim.toLowerCase().substring(1, isim.length());
        } if (boslukSay==1){
            adSoyad=isim.toUpperCase().charAt(0)+isim.toLowerCase().substring(1, isim.indexOf(' '))+" "
                    +isim.toUpperCase().charAt(isim.indexOf(' ')+1)+isim.toLowerCase().substring(isim.indexOf(' ')+2,isim.length());

        }if (boslukSay==2){
            isim2=isim.substring(isim.indexOf(' ')+1,isim.length());

            adSoyad=isim.toUpperCase().charAt(0)+isim.toLowerCase().substring(1, isim.indexOf(' '))+" " +
                    isim2.toUpperCase().charAt(isim.indexOf(' ')+1) +
                    isim2.toLowerCase().substring(1,isim2.indexOf(' '))+" " +
                    isim2.toUpperCase().charAt(isim2.indexOf(' ')+1)+isim2.toLowerCase().substring(isim2.indexOf(' ')+2,isim2.length());

        }
        System.out.println("Ad Soyad= " + adSoyad);
    }


}
