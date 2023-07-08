package j100_CodeChallange.project02;


import java.util.ArrayList;
import java.util.Arrays;

public class Task03_2DArrayList {

        /*
          Task:

        Create 2D ArrayList which can store String ArrayLists
        Create 3 ArrayLists which are Employees, Employers, Companies
        Store this 3 ArrayList in 2D ArrayList
        String data type ArrayList'leri depolayabilen 2D ArrayList create ediniz
        Çalışanlar, İşverenler, Şirketler olmak üzere 3 ArrayListesi oluşturun
        Bu 3 ArrayList'i 2D ArrayList'te saklayın
         */

    public static void main(String[] args) {

        ArrayList<String> calisanlar = new ArrayList<>(Arrays.asList("Zeynep", "Aytekin", "Ömer", "Mustafa", "Ali", "Serap", "Ebru", "Ayşe"));
        ArrayList<String> isveren = new ArrayList<>(Arrays.asList("Halime Bak", "Çin Li", "Tatar Irmızan", "İrecep", "sefil haluk", "deli Gadir Ulen", "Hökümet Gadın", "Özkan Uğur"));
        ArrayList<String> sirket = new ArrayList<>(Arrays.asList("sirket-i hayriye", "gugıl", "clarusawy", "Microsoft", "Tarfin", "Mamut hoca", "tesla", "Amazon"));
        ArrayList<ArrayList<String  >> listeler = new ArrayList<>(Arrays.asList(calisanlar,isveren,sirket));
        System.out.println("calisanlar = " + calisanlar);//
        System.out.println("isveren = " + isveren);//
        System.out.println("sirket = " + sirket);//
        System.out.println("listeler = " + listeler);//


    }
}



