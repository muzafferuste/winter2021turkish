package day27_arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Ali");
        list.add("Can");
        list.add("Ayse");
        list.add("Fatma");

        System.out.println(list); // [Ali, Can, Ayse, Fatma]

        // set() = Istenen index'de ki elemani kaldirir, yerine bizim istedigimiz elemani ekler (raplace)

        System.out.println(list.set(2, "Kemal")); // islemi yapar ama
                                                  // sonuc olarak 2. indexteki objeyi return eder
        System.out.println(list); // [Ali, Can, Kemal, Fatma]

        list.set(0, "Semih");
        System.out.println(list); // [Semih, Can, Kemal, Fatma]

        /*list.set(5, "Mustafa");
        System.out.println(list);
        Bu sekilde yazilirsa RTE verir
         */

        list.add(2, "Yasin");
        System.out.println(list); // [Semih, Can, Yasin, Kemal, Fatma]

        list.add(2, "Hurriyet");
        System.out.println(list); // [Semih, Can, Hurriyet, Yasin, Kemal, Fatma]

        /*list.add(10, "Seher");
        System.out.println(list);
        Size'dan buyuk bir index girilemez.
        Ama index olarak Size girilirse son eleman olarak ekleme yapar
         */

        System.out.println(list.contains("Hurriyet")); // true
        System.out.println(list.contains("Mehmet")); // false

        list.contains("Cemal"); // Bize boolean bir sonuc verir, liste degizmes

        // List'in elemanlarini siralayiniz

        /* Java bize kolaylik olsun diye Collections class'ini olusturmustur.
        ayni Array'de ki Arrays class'i gibidir.
         */

        Collections.sort(list);
        System.out.println(list); // [Can, Fatma, Hurriyet, Kemal, Semih, Yasin]



    }

}
