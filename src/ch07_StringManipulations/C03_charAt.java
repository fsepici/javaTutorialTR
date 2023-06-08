package ch07_StringManipulations;

import java.util.Scanner;

public class C03_charAt {
    public static void main(String[] args) {

        /*
       charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
       index değeri 0'dan başlar
        */


        String city = "İstanbul";
        System.out.println("city.charAt(0) = " + city);

        String city2 = "Hakkari";

        if (city2.length() % 2 == 0) {
            System.out.println(" orta karakteri yoktur");
        } else {
            System.out.println("Ortadaki karakter = " + city2.charAt(city2.length() / 2));
        }
        // Task-> istanbul izmir  girilen kelimenin kelimesinin ortadaki karakteri
// print eden code create ediniz...

        System.out.println("city2.contains(\"k\") = " + city2.contains("ak"));



        String buzDolap = "elma peynir yumurta zeytin bal kaymak";
        Scanner scan = new Scanner(System.in);
        System.out.println("ürün gir");
        String urun = scan.nextLine();

        String result = buzDolap.contains(urun) ? "evet bu ürün  dolapta var" : "bu ürün dolapta yok";
        System.out.println("result = " + result);


        //TASK giirlen sifrenin dogru ise erisim izni verin yanlis ise vermeyin
// ternary ile switch ile if ile yapiniz
//bug i bulunuz
//contains methodu sifre kontrol islemlerinde KULLANILMAMALI

        String password="12345";
        System.out.print("Şifrenizi giriniz =");
        String sifre=scan.nextLine();
        if(password.equals(sifre)) {
            System.out.println("Şifreniz doğru \nMENÜ");
        }else
        {
            System.out.println("şifreniz yanlış ");
        }



                /*
        charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
        index değeri 0'dan başlar
         */
/*
        String city = "Istanbul" ;

        //city variable inin biirinci karakterini bulun yazdirin
        System.out.println("city.charAt(0) = " + city.charAt(0)); //city.charAt(0) = I

        //city variable inin biirinci indexte ki elemani bulun yazdirin
        System.out.println("city.charAt(1) = " + city.charAt(1));//city.charAt(1) = s
        char cityBirinciIndexElemani = city.charAt(1);
        System.out.println("cityBirinciIndexElemani = " + cityBirinciIndexElemani);//cityBirinciIndexElemani = s


        //task son karakteri alin atama ile  yazdiran kod yaziniz
        int sonHarfIndexi = city.length()-1 ;
        System.out.println("sonHarfIndexi = " + sonHarfIndexi);//sonHarfIndexi = 7

        System.out.println("city.charAt(sonHarfIndexi) = " + city.charAt(sonHarfIndexi));//

        //alinan son karakteri uygun bir variable a atama yaparak uazdirin
        char sonHarf = city.charAt(sonHarfIndexi) ;
        System.out.println("sonHarf = " + sonHarf);//sonHarf = l

        //RTE   System.out.println("city.charAt(21) = " + city.charAt(21));
        //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 21


        // Task-> istanbul izmir  girilen kelimenin kelimesinin ortadaki karakteri
        // print eden code create ediniz...
        Scanner input = new Scanner(System.in);
        System.out.println("bir sehir ismi gir");
        String city2 = input.nextLine();

        if (city2.length() % 2 ==0){//harf sayisi iki nin tam kati ise ortanca harf yoktur
            System.out.println("senin sehrin ortasi yok");
        }else{//girlen ifadenin length i tek sayili ise else caliscak
            //bu length i 2 ye bolerek ortada ki index bulunur
            System.out.println("city2.charAt(city2.length() / 2 ) = " +
                    city2.charAt(city2.length() / 2));
        }

    */

    }
}