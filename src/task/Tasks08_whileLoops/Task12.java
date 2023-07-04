package task.Tasks08_whileLoops;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin = scan.nextLine();
        int i = 0;
        int rakam = 0;
        int harf = 0;
        int ozelchar = 0;

        do {
            char karakter = metin.charAt(i);
            if (Character.isDigit(karakter)) {
                rakam++;
            } else if (Character.isLetter(karakter)) {
                harf++;
            } else {
                ozelchar++;
            }
            i++;
        } while (i < metin.length());

        System.out.println("Girilen metindeki özel karakter sayısı = " + ozelchar);
        System.out.println("Girilen metindeki rakam karakter sayısı = " + rakam);
        System.out.println("Girilen metindeki harf karakter sayısı = " + harf);

    }

}
