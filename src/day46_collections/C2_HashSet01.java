package day46_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C2_HashSet01 {

    public static void main(String[] args) {

        /* Verilen bir Array'de ki tekrarli elemanlari silip
        unique elemanlardan olusan bir Array'e cevirin
        Islemi yaparken Method kullanin
         */

        int arr[] = {2, 3, 4, 3, 5, 3, 6, 4, 7, 4, 8, 5};

        int tekrarsizArray[] = tekrarlariSil(arr);

        System.out.println("Arr olarak main method icinde" + Arrays.toString(tekrarsizArray));

    }

    public static int[] tekrarlariSil(int[] arr) {

        Set<Integer> set1 = new HashSet<>(); // Set olusturduk

        // Array'de ki her bir elemani Set'e ekleyerek
        // direkt olarak tekrarlardan kurtulmus oluruz
        for (Integer each :
                arr) {

            set1.add(each);
        }

        System.out.println("Set olarak method icinde" + set1);

        // Set'in size'ini alip bu buyuklukte bir array olusturuyoruz
        int tekrarsizArray[] = new int[set1.size()];

        // Set'de ki elemanlari Array'e eklemek icin array index'e
        // ihtiyac duydugu icin int index = 0; local variable'ini olusturduk
        int index = 0;

        for (int each :
                set1) {

            tekrarsizArray[index] = each;

            index++;
        }

        System.out.println("Arr olarak method icinde" + Arrays.toString(tekrarsizArray));

        return tekrarsizArray;

    }

}
