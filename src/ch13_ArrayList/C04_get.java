package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_get {
    public static void main(String[] args) {

        ArrayList<String> country=new ArrayList<>(List.of("MADAGASKAR","ALMANYA","POLONYA","İTALYA"));
        System.out.println("country = " + country);

        ArrayList<String> city=new ArrayList<>(Arrays.asList("Angara","erzurum","izmir"));
        System.out.println("city = " + city);


        System.out.println("city.get(1) = " + city.get(1));




    }
}
