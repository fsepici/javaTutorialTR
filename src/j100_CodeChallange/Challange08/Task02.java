package j100_CodeChallange.Challange08;

public class Task02 {
    public static void main(String[] args) {
        /* task->
         * dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan buyuk olan elemanlari print eden code create ediniz.
         * input[]= {1,2,3,4,5,6,7}
         * Output1 : 4
         * Output2 : 5,6,7
         */

        int arr [] = {1,2,3,4,5,6,7};
        int toplam=0;// arr elemanları toplanıma atanacak boş kutu tanımlandı
        for (int i = 0; i < arr.length; i++) {//arr elemanlarının tekrara alıan loop tanımlandı
           toplam+= arr[i];// döngüdeki her bir arr elemanı toplama eklendi
        }
        System.out.println("toplam = " + toplam); // 28
        System.out.println("ortalama : " + (toplam / arr.length)); // 4
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>toplam/ arr.length) {//döngüdeki her bir arr elemanı ortalamadan buyuk olma sartı
                System.out.print(arr[i]+" ");// 5 6 7
            }
        }

    }
}
