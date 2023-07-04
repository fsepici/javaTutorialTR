package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {

        ArrayList<String> country=new ArrayList<>(List.of("MADAGASKAR","ALMANYA","POLONYA","İTALYA"));
        System.out.println("country = " + country);

        ArrayList<String> city=new ArrayList<>(Arrays.asList("Angara","erzurum","izmir"));
        System.out.println("city = " + city);

        ArrayList<String> yeniList=new ArrayList<>(Collections.nCopies(7,"NEW ZEALAND"));
        System.out.println("yeniList = " + yeniList);

        city.addAll(country);
        System.out.println("city = " + city);
        city.addAll(2,country);
        System.out.println("city = " + city);
        System.out.println("country = " + country);


    }
}
