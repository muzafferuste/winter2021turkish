package day48_maps;

import java.util.*;

public class Maps02 {

    public static void main(String[] args) {

        /* Asagida verilen map'de yazilim dili Java olan kisi
        isimlerini liste olarak yazdiran bir method yaziniz
         */

        Map<Integer, String> map1 = new HashMap<>();

        map1.put(101, "Ali, Can, Java");
        map1.put(102, "Veli, Yan, Java");
        map1.put(103, "Ali, Yan, C#");

        String istenenDil = "Java";

        List<String> isimList = javaBilenler(map1, istenenDil);

        System.out.println("Bilenler" + isimList);

        System.out.println("Git'e merhaba");

    }

    public static List<String> javaBilenler(Map<Integer, String> map1, String istenenDil) {

        List<String> isimList = new ArrayList<>();

        for (String each :
                map1.values()) {

            String arr[] = each.split(", ");

            if (arr[2].equalsIgnoreCase(istenenDil)) {

                isimList.add(arr[0]);
            }

        }

        return isimList;

    }

}
