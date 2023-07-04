package task.Tasks08_whileLoops;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("İsminizi giriniz =");
		String isim= scan.nextLine();

		int i=0;

		while (i<isim.length()){
			if (isim.charAt(i)!=' '){
				System.out.print(isim.charAt(i)+" ");
			}
			i++;
		}


	}

}
