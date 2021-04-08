package day27_arrayLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);

        List<Integer> list2 = new ArrayList<>();
        list1.add(20);
        list1.add(10);

        // equals() 2 list'i elemanlarla beraber indexlerini de karsilastirir
        // Hem elemanlar hem de elemanlarin indexleri esit ise true return eder
        // geri kalan tum durumlarda false doner
        System.out.println(list1.equals(list2)); // false

        Collections.sort(list1);
        Collections.sort(list2);

        System.out.println(list1.equals(list2)); // true

        list1.clear();

    }

}
