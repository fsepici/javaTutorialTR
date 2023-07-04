package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_indexof {
    public static void main(String[] args) {

        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR", "ALMANYA", "POLONYA", "İTALYA"));
        System.out.println("country = " + country);

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara", "erzurum", "izmir"));
        System.out.println("city = " + city);

        System.out.println("city.indexOf(\"samsun\") = " + city.indexOf("samsun"));

        System.out.println("city.indexOf(\"Angara\") = " + city.indexOf("Angara"));

        country.add("İngiltere");
        System.out.println("country.indexOf(\"İngiltere\") = " + country.indexOf("İngiltere"));
        System.out.println("country.lastIndexOf(\"İngiltere\") = " + country.lastIndexOf("İngiltere"));
        country.add("ALMANYA");
        System.out.println("country.indexOf(\"ALMANYA\") = " + country.indexOf("ALMANYA"));
        System.out.println("country.lastIndexOf(\"ALMANYA\") = " + country.lastIndexOf("ALMANYA"));


        System.out.println("country = " + country);


    }
}
