package task.tasks12;

public class Task17 {
    public static void main(String[] args) {
        // task-> sayi arr'deki en buyk elemanı print eden code create ediniz...
        int sayi[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}};//24
        int max = 0;
        for (int i = 0; i < sayi.length; i++) {
            for (int j = 0; j < sayi[i].length; j++) {
                if (sayi[i][j] > max) {
                    max = sayi[i][j];
                }


            }

        }
        System.out.println("Dizideki en büyük sayı =" + max);


    }
}
