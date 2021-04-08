package day27_arrayLists;

import java.util.*;

public class ArrayList07 {

    public static void main(String[] args) {

        /* Verilen bir Array'de ki tekrarli elemanlari silip tekrarsiz
        bir Array olusturun. Array veya List kullanarak cozunuz
         */

        int arr[] = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 3, 2, 1, 8, 6, 4, 7};

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!list.contains(arr[i])) {

                list.add(arr[i]);
            }
        }

        Collections.sort(list);
        System.out.println(list);
        Integer duzenliArray[] = list.toArray(new Integer[0]);

        System.out.println(Arrays.toString(duzenliArray));

    }
}
