package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {

        int sayi=99;

        int [][] arrMd =new int [5][6];
        ArrayList<String> names=new ArrayList<>();
        ArrayList<Integer> numbers=new ArrayList<>();

        System.out.println("names = " + names);
        System.out.println("numbers = " + numbers);

        names.add("22");
        names.add("safak");
        names.add("iclal");
        names.add("rukiye");
        names.add("ali");
        names.add("burjuva");
        names.add("proleterya");

        System.out.println("names = " + names);

       numbers.add(22);
       numbers.add(55);
       numbers.add(77);
       numbers.add(217);
       numbers.add(17);
       numbers.add(9);
       numbers.add(14);
       numbers.add(9096);

        System.out.println("numbers = " + numbers);


        ArrayList<String> city=new ArrayList<>(Arrays.asList("Angara","erzurum","izmir"));
        System.out.println("city = " + city);

        ArrayList<String>country=new ArrayList<>(List.of("MADAGASKAR","ALMANYA","POLONYA","İTALYA"));
        System.out.println("country = " + country);
        System.out.println("country.size() = " + country.size());

        country.add(1,"Türkiye");
        System.out.println("country.size() = " + country.size());
        System.out.println("country = " + country);


    }
}
