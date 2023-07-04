package ch14_ForEachLoop;

public class C02_forEachLoop {
    public static void main(String[] args) {

        // task bir md array in elamanlarının çarpımını print eden code create ediniz...-> with for-each
        int[][] arr = {{2, 5, 6, 8}, {1, 2, 5, 8}, {3, 5, 7, 9}};
        int carpim = 1;
        int carpim2 = 1;
        for (int [] i : arr) {
            for (int j : i) {
                carpim*=j;


            }

        }
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                carpim2 *=arr[i][j];

            }

        }

        System.out.println("carpim = " + carpim);
        System.out.println("carpim2 = " + carpim2);
    }
}
