package j100_CodeChallange.Challange08;

public class Task07 {
    public static void main(String[] args) {
        /* task->
         * verilen  {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini için
         *  2D arrayinden min number print den code create ediniz.
         */

        int arr[][] = {{10, 2, 3}, {2, 34, 1}, {-51, 5, 5}, {2, -1}};
        int min=arr[0][0];//arr'nin ilk elemanı min sayı olarak atandı

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] <min) {//döngüdeki herbir arr elamanı min'dan kucuk olma şartı
                    min = arr[i][j];;// döngüde min dan kuck olan arr elemanı yeni min olarak atandı
                }
            }
        }
        System.out.println("min = " + min);


    }


}
