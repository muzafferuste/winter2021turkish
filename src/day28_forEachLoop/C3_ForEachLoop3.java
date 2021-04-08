package day28_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C3_ForEachLoop3 {

    public static void main(String[] args) {

        // Verilen bir Array'de ki tum elemanlari List'e aktaran bir method yaziniz

        String arr[] = {"Ali", "Veli", "Ayse", "Fatma"};

        List<String> list = listeCevir(arr);

        list.add(0, "Bu is bu kadar");

        System.out.println(list);

    }

    public static List<String> listeCevir(String[] arr) {

        List<String> geciciList = new ArrayList<>();

        for (String each: arr) {

            geciciList.add(each);
        }

        return geciciList;
    }

}
