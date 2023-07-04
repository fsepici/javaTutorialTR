package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C15_ArrayConverttoList {
    public static void main(String[] args) {

        String [] names ={"Ali","Zeynep","Fatih","Safak","Derya"};
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

        List <String> namesList = Arrays.asList(names);
        System.out.println("namesList = " + namesList);

        ArrayList <String> nameArrayList=new ArrayList<>(Arrays.asList(names));

        System.out.println("nameArrayList = " + nameArrayList);
        Collections.sort(nameArrayList);
        System.out.println("nameArrayList = " + nameArrayList);




    }
}
