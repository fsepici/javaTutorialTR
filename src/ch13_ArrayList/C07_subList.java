package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_subList {
    public static void main(String[] args) {

        ArrayList<String> country=new ArrayList<>(List.of("MADAGASKAR","ALMANYA","POLONYA","İTALYA"));
        System.out.println("country = " + country);


        System.out.println("country.subList(3,5) = " + country.subList(3, 4));

        ArrayList<String> yeniList=new ArrayList<>(country.subList(2,4));

        System.out.println("yeniList = " + yeniList);


    }
}
