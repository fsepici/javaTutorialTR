package j100_CodeChallange.Challange05;

public class Q09_ForLoop {

    //Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line with a space between consecutive integers

    public static void main(String[] args) {
        int count = 0;
        int toplam=0;

        for (int i = 11; i <= 120; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                count++;
                toplam+=i;
            }

        }
        System.out.println("4 ve 6 ya tam bölünen sayı adedi = "+count);
        System.out.println("Bölünen sayıların toplamı = " + toplam);
    }

}
