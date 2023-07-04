package task.Tasks08_whileLoops;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */
        int count = 0;
        int i = 1000;
        while (i > 99) {
            i--;
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " , ");
                count++;

            }


        }
        System.out.println();
        System.out.println("4 ve 6 ya tam bölünen 3 basamaklı tam sayı adedi = " + count);

    }

}
