package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_size {
    public static void main(String[] args) {

        ArrayList<String> country=new ArrayList<>(List.of("MADAGASKAR","ALMANYA","POLONYA","İTALYA"));
        System.out.println("country = " + country);

        ArrayList<String> city=new ArrayList<>(Arrays.asList("Angara","erzurum","izmir"));
        System.out.println("city = " + city);

        System.out.println("country.size() = " + country.size());

        System.out.println("country.set(0,\"AMERİKA\") = " + country.set(0, "AMERİKA"));

        System.out.println("country.size() = " + country.size());

        System.out.println("country = " + country);


    }
}
