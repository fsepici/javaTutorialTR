package j100_CodeChallange.Challange08;

public class Task09 {
    static          int arr[][] = {{1, 3, 6}, {2, 8}, {5, 7, 9, 14}};
    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * create ediniz.
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */


       // int arr[][] = {{1, 3, 6}, {2, 8}, {5, 7, 9, 14}};

        System.out.println("ciftToplaPli(arr) = " + ciftToplaPli(arr));
        System.out.println("ciftToplaPsiz(arr) = " + ciftToplaPsiz());

    }//main sonu

    private static int ciftToplaPli(int[][] arr) {
       int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2 ==0) {
                    toplam+=arr[i][j];
                }
            }

        }
        return toplam;
    }
    private static int ciftToplaPsiz() {

        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2 ==0) {
                    toplam+=arr[i][j];
                }
            }

        }
        return toplam;
    }

}//Class sonu