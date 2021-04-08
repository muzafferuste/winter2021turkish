package day29_passByValueImmutable;

import java.util.ArrayList;
import java.util.List;

public class C4_Immutable01 {

    public static void main(String[] args) {

        String isim = "Ali";
        isim.concat("can");

        System.out.println(isim.concat("can")); // Alican
        System.out.println(isim); // Ali

        System.out.println(isim.concat("can")); // Alican
        System.out.println(isim); // Ali

        // String'lerde method kullandigimizda String kendisi degistirilmez
        // cunku Java String Class'ini immutable yapmistir

        List<String> List = new ArrayList<>();

        System.out.println(List); // []

        List.add("Ali");
        List.add("Can");

        System.out.println(List); // [Ali, Can]

        System.out.println(List.remove(1)); // Can

        System.out.println(List); // [Ali]

        // list'lerde method'la yaptigimiz degisiklikler kalici olarak list'e islenir.
        // cunku list mutable'dir.

    }

}
