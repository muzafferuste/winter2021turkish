package day44_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@SuppressWarnings("ALL")
public class Iterator03 {

    public static void main(String[] args) {

        /* Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program yaziniz
        (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
        Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
        output: [23,40]
         */

        List<Integer> yasList = new ArrayList<>();

        yasList.add(2);
        yasList.add(13);
        yasList.add(56);
        yasList.add(23);
        yasList.add(45);
        yasList.add(14);
        yasList.add(40);

        System.out.println(yasList);

        ListIterator li1 = yasList.listIterator();

        // List list2 = new ArrayList(); benim yaptigim yontem icin mecburen yeni List olusturdum

        while (li1.hasNext()) {

            int temp = (int) li1.next();

            // mEHMET HOCANIN YAPTIGI ARALIKTA OLMAYAN ELEMANIN SILINMESI
            // (YENI LIST'E GEREK YOKTUR)
            if (temp < 20 || temp > 40) {

                li1.remove();

            }

        }

        System.out.println(yasList);

    }

}
