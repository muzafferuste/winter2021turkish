package day28_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C5_ForEachLoop5 {

    public static void main(String[] args) {

        /* Bir Integer List olusturunuz ve bu list'de ki tum
        elemanlarin karelerinin toplamini ForEachLoop kullanarak
        hesaplayip ekrana yazdiriniz
         */

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(5);
        list.add(3);
        list.add(8);


        System.out.println("List'de bulunan objeler: " + list); // [10, 5, 3, 8]

        int kareleriToplami = 0;

        for (Integer each :
                list) {

            kareleriToplami += each * each;
        }

        System.out.println("List'de bulunan objelerin kareleri toplami: " +
                kareleriToplami);

    }

}
