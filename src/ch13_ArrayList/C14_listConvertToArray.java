package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class C14_listConvertToArray {
    public static void main(String[] args) {

        ArrayList<String> country=new ArrayList<>(List.of("MADAGASKAR","ALMANYA","POLONYA","İTALYA"));
        System.out.println("country = " + country);

        Object [] arrCountry=country.toArray();
        System.out.println("Arrays.toString(arrCountry) = " + Arrays.toString(arrCountry));



        String [] arrCountry2=country.toArray(new String[0]);
        System.out.println("Arrays.toString(arrCountry2) = " + Arrays.toString(arrCountry2));


    }
}
