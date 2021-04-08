package day27_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

    public static void main(String[] args) {

        // verilen bir array'i List'e cevirebilir miyiz?

        String[] arr = {"Ali", "Veli"};

        List<String> listArr = Arrays.asList(arr);

        System.out.println(listArr);

        Integer[] arr1 = {1, 2, 3};

        List<Integer> list2 = Arrays.asList(arr1);

        System.out.println(list2);

        /* Bazen cok fazla elemani olan bir List olusturmamiz gerekir.
        Bu durumda List elemanlarini tek tek eklemek yerine
        elemanlari bir Array'e ekler, sonra da o Array'i List'e cevirebiliriz

        Ornek: bir WebSitesinin tum urunlerini bir List'e eklemek istedigimizde...

        Ancak; bu method ile Array'den cevirdigimiz List uzunluk konusunda esnek olmmaz
        (Array'in ozelliklerini tasir) add(), remove(), clear() gibi
        uzunlugu etkileyen methodlar kullanilamaz.

        Java bu degisimdeki Array ve List'i senkronize eder, birinde yaptigimiz degisiklik
        otomatik olarak digerini de update eder

        Array veya List'den herhangi birinde yaptigimiz degisiklik digerinde de gorunur
         */

        arr1[1] = 5;

        System.out.println("Array: " + Arrays.toString(arr1));

        System.out.println("List2: " + list2);

        list2.set(2, 13);

        System.out.println("List2: " + list2);

        System.out.println("Array: " + Arrays.toString(arr1));

    }

}
