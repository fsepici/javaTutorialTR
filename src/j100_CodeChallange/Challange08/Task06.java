package j100_CodeChallange.Challange08;

public class Task06 {
    public static void main(String[] args) {
        /* task->
         * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
         * Bu iki array'in tum elemanlarinin toplamini print eden code create ediniz.

         */
        int toplam = 0;
        int arr1[][] = {{0, 2, -1}, {3, 8, 9}, {7}};
        int arr2[][] = {{-7, 6, -9}, {0, 12}, {19}};
        for (int kat = 0; kat < arr1.length; kat++) {
            for (int daire = 0; daire < arr1[kat].length; daire++) {
                toplam += arr1[kat][daire];
            }
        }
        for (int kat = 0; kat < arr2.length; kat++) {
            for (int daire = 0; daire < arr2[kat].length; daire++) {
                toplam += arr2[kat][daire];
            }

        }
        System.out.println("toplam = " + toplam);//49
    }
}