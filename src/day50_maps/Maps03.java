package day50_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maps03 {

    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(101, "Ali, Can, Java");
        map1.putIfAbsent(102, "Veli, Yan, Java");
        map1.put(103, "Ali, Can, C#");

        System.out.println(map1.get(101)); // Ali, Can, Java
        System.out.println(map1.get(105)); // null

        map1.getOrDefault(105, "Aradiginiz key map'de yok"); // Aradiginiz key map'de yok

        System.out.println(map1.keySet()); // [101, 102, 103]

        map1.replace(103, "Mesut, Aksu, Java"); // put ile de bu islemi yapabiliriz

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("H", 1);
        map2.put("e", 1);
        map2.put("l", 2);
        map2.put("o", 3);

        System.out.println(map2);

        map2.compute("H", (key, value)-> 10);

        System.out.println(map2);

    }

}
