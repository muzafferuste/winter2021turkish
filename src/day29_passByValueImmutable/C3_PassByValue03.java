package day29_passByValueImmutable;

import java.util.ArrayList;
import java.util.List;

public class C3_PassByValue03 {

    public static void main(String[] args) {

        /* Soru3: Bir list olusturalim. Eleman olarak 10, 11, 12 ekleyelim.
        Iki method olusturup list elemanlarini artirmayi deneyelim.
        - 1.Method'da eklenen elemanlari forEachLoop kullanarak artirin
        - 2.Method'da ekemanlari setMethod'u kullanarak artirin
        - Method'lari arka arkaya cagirip artislarin kalici olup olmadiklarini kontrol edelim
         */

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(11);
        list.add(12);

        System.out.println("Hic bir islem yapilmadan list'in degeri: " + list); // [10, 11, 12]

        degistirFor(list);

        System.out.println("degistirFor() kullanim sonrasi main ici: " + list); // [10, 11, 12]

        degistirSet(list);

        System.out.println("degistirSet() kullanim sonrasi main ici: " + list); // [13, 14, 15]

    }

    public static void degistirSet(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            list.set(i, list.get(i)+3);
            /* Java Pass By Value kullanir ancak list'deki set method'u istisnai olarak
            method'un icinde yapilan degoisiklikleri de kalici hale getirir !!!!!!!!!!!
             */
        }

        System.out.println("degistirSet()'in icinde: " + list); // [13, 14, 15]
    }

    public static void degistirFor(List<Integer> list) {

        /* ForEachLoop ile listeyi guncellemeiyoruz
        sadece her bir elemani tek tek cagirip 3 artirip yazdirdik
         */

        System.out.print("degistirFor()'unda for ile artirma islemi: ");

        for (Integer each :
                list) {

            each += 3;
            System.out.print(each + " ");
        }

        System.out.println();
        System.out.println("degistirFor() icinde: " + list); // List'in kendisinin degismedigi buradan gorulebilir
    }

}
