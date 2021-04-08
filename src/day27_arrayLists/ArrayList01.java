package day27_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Ali");
        list.add("Can");
        list.add("Ayse");
        list.add("Fatma");

        System.out.println(list); // [Ali, Can, Ayse, Fatma]

        System.out.println(list.size()); // 4

        System.out.println(list.remove(1)); // Can
        // index'i 1 olan Can'i silip, sildigi elemani bana return edecek

        System.out.println(list); // [Ali, Ayse, Fatma]

        System.out.println(list.remove("Ayse"));
        // Ayse'yi silecek ve bize true return eder

        System.out.println(list); // [Ali, Fatma]

        System.out.println(list.remove("Mehmet"));
        // Mehmet'i bulamadigi icin silemedi ve bize false return etti

        System.out.println(list); // [Ali, Fatma]

        list.remove("Ali");
        list.remove("Fatma");

        System.out.println(list); // [] ==> (Bos bir List)

    }
}
