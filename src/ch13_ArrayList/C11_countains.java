package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_countains {
    public static void main(String[] args) {

        ArrayList<String> country=new ArrayList<>(List.of("MADAGASKAR","ALMANYA","POLONYA","İTALYA"));
        System.out.println("country = " + country);

        System.out.println("country.contains(\"ALMANYA\") = " + country.contains("ALMANYA"));
        System.out.println("country.contains(\"polonya\") = " + country.contains("polonya"));



    }
}
