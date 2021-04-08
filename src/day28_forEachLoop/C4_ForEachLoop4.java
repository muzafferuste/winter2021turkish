package day28_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C4_ForEachLoop4 {

    public static void main(String[] args) {

        /* 2 String Array olusturun ve Array'lerdeki ortak elemanlari
        ForEachLoop kullanarak bulunuz. Sonucu ekrana yazdiriniz
        Ortak eleman yoksa ekrana "Ortak Eleman Yok" yazdirin
         */

        String arr1[] = {"Ali", "Can", " Ayse", "Seher", "Veli"};
        String arr2[] = {"Ali", "Veli", "Mesut", "Seher", "Sedat", "Ali"};

        // Ortak elemanlari koymak icin bir list olusturalim

        List<String> ortakElemanlar = new ArrayList<>();

        for (String eachArr1 : arr1) {

            for (String eachArr2 : arr2) {

                if (eachArr1.equals(eachArr2)) {

                    ortakElemanlar.add(eachArr1);
                }
            }
        }

        if (ortakElemanlar.isEmpty()) {

            System.out.println("Ortak Eleman Yok");
        } else {

            System.out.println("Ortak elemanlarin listesi: " + ortakElemanlar);
        }

    }

}
