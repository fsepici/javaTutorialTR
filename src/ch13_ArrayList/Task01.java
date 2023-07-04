package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task01 {

    public static void main(String[] args) {

        ArrayList <String> names=new ArrayList<>(List.of("Ali","Serap","Zeynep","Fuat"));
        ArrayList <String> newNames=new ArrayList<>();

        System.out.println("Names = " + names);

        for (int i = 0; i < names.size(); i++) {
            if (!names.get(i).toLowerCase().contains("a")){
                newNames.add(names.get(i));
                
            }

        }
        System.out.println("newNames = " + newNames);

        names.clear();
        System.out.println("names = " + names);
        names.addAll(newNames);
        System.out.println("names = " + names);


    }
}
