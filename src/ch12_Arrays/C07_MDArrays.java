package ch12_Arrays;

public class C07_MDArrays {
    public static void main(String[] args) {
// task ->mdArr tum elemanlarını toplayan code create ediniz


        int [] [] aprMD = { {1,2,3 }, {10,23 },{103 }  };
        int toplam=0;
        for (int i = 0; i <aprMD.length; i++) {
            for (int j = 0; j <aprMD[i].length; j++) {
                toplam+=aprMD[i][j];

            }

        }

        System.out.println("toplam = " + toplam);
    }
}
