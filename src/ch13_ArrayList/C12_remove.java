package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C12_remove {
    public static void main(String[] args) {


        ArrayList<String> country=new ArrayList<>(List.of("MADAGASKAR","ALMANYA","POLONYA","İTALYA"));
        System.out.println("country = " + country);

        Collections.sort(country);

        System.out.println("country.remove(\"NORWAY\") = " + country.remove("NORWAY"));
        System.out.println("country.remove(\"italya\") = " + country.remove("italya"));
        System.out.println("country.remove(\"italya\") = " + country.remove("İTALYA"));
        System.out.println("country = " + country);
        System.out.println("country.remove(0) = " + country.remove(0));
        System.out.println("country = " + country);
    }
}
