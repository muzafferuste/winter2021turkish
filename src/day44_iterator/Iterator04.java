package day44_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@SuppressWarnings("ALL")
public class Iterator04 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        list1.add(2);
        list1.add(13);
        list1.add(56);
        list1.add(23);
        list1.add(45);
        list1.add(14);
        list1.add(40);

        System.out.println("Eski list1 degeri: " + list1);

        ListIterator li1 = list1.listIterator();

        while (li1.hasNext()) {

            li1.next();

        }

        List<Integer> sepet = new ArrayList<>();

        while (li1.hasPrevious()) {

            int temp = (int) li1.previous();
            System.out.print(temp + ", ");
            sepet.add(temp);

        }

        System.out.println();
        // System.out.println(list1);
        // System.out.println(sepet);
        list1.clear();

        ListIterator sepetInterior = sepet.listIterator();

        while (sepetInterior.hasNext()) {

            int temp = (int) sepetInterior.next();
            list1.add(temp);

        }

        System.out.println("Yeni list1 degeri: " + list1);

    }

}
