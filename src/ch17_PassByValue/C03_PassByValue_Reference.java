package ch17_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_PassByValue_Reference {
    public static void main(String[] args) {

         /*
java non-primitive(Class array list-> refrans ) data turlerinde obj
kendisi değil de dataları geğişirse
obj referans ve kendisi değişmediği dataları değişikliğini kalıcı yapar.
 */

// Task -> list elemanları 24,20,87 iki farklı method ile list elemanlarını
//      update yapan print eden code create ediniz.
//1. method-> with for each   2. method-> set(index,value)

        List<Integer> list = new ArrayList<>(Arrays.asList(24,20,87));
        System.out.println("operasyon öncesi list ="+list);
        listUpdate1(list);
        System.out.println("1 metodu çalıştı");
        listUpdate2(list);
        System.out.println("2 metodu çalıştı");

        System.out.println("operasyon sonrası list ="+list);






    }

    private static void listUpdate2(List<Integer> list) {
        for (int i = 0; i <list.size(); i++) {
            list.set(i, list.get(i)*2);

        }
        System.out.println("listupdate2 methodu içinden list"+list);
    }

    private static void listUpdate1(List<Integer> list) {
        for (Integer w:list) {
            w*=2;

        }
        System.out.println("listupdate1 methodu içinden list"+list);
    }
}
