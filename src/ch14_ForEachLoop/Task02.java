package ch14_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Task02 {
    public static void main(String[] args) {


int [] arr={1,2,-3,4,-5,-6};

sayinunTersIsaretu(arr);
isaretDegis(arr);


    }

    private static void isaretDegis(int[] array) {

        List<Integer> list=new ArrayList<>();
        for (int each:array) {
            each*=-1;
            list.add(each);


        }
        System.out.println("list = " + list);


    }

    private static void sayinunTersIsaretu(int[] array) {
        for (int w:array) {
            w*=-1;
            System.out.print(w+" ");

        }



    }
}
