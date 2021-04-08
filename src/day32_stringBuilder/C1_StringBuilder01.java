package day32_stringBuilder;

import java.sql.SQLOutput;
import java.util.Objects;

public class C1_StringBuilder01 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Rumeysa");
        System.out.println(sb1);

        sb1.append(" ").append("Cetinturk");
        System.out.println(sb1); // Rumeysa Cetinturk

        String cumle = "Javayi cok sever";
        sb1.append(cumle, 6, 10);
        System.out.println(sb1); // Rumeysa Cetinturk cok

        System.out.println(sb1.length()); // 21
        System.out.println(sb1.capacity()); // 23

        System.out.println(sb1.charAt(1)); // u

        sb1.charAt(5); // Bize bilgi getiren methodlar SB'yi degistirmez
        System.out.println(sb1); // Rumeysa Cetinturk Java cok

        sb1.delete(17, 21); // 17 ile 21. index arasindaki characterleri siler
        System.out.println(sb1); // Rumeysa Cetinturk

        sb1.deleteCharAt(16); // 16. index'de ki character'i siler
        System.out.println(sb1); // Rumeysa Cetintur

        String isim = "Rumeysa Cetintur";
        System.out.println(sb1.equals(isim)); // false
        // data type'i farkli oldugu icin icerigi kiyaslamasi mumkun degildir bu yuzden false

        /* StringBuilder'da equals method'u String'den farkli calisir
        ancak kendisi ile kiyaslanirsa true verir
        String'de ki == operatoru gibi calisir
         */
        StringBuilder sb2 = new StringBuilder("Rumeysa Cetintur");
        System.out.println(sb1.equals(sb2)); // false

        System.out.println(sb1.equals(sb1)); // true

        /* !!! NOT !!!
        ama illa equals kullanmamiz gerekirse ikisinide String'e cevirerek kontrol edebiliriz
         */

        System.out.println(sb1.indexOf("Cetin")); // 8 (Cetin'in basladigi yerin index'ini verir)
        System.out.println(sb1.indexOf("e", 6)); // 9 (e'harfinin 6.indexten sonraki ilk bulundugu yer)

        System.out.println(sb1.indexOf("Kazim")); // -1 olmadigini belirtmek icin

        sb1.insert(0, "-");
        System.out.println(sb1); // -Rumeysa Cetintur

        cumle = "Merhaba Dunya";
        sb1.insert(0, cumle, 0, 7);
        /*  sb1.insert(0, cumle, 0, 7) aciklamasi !!!
        0 : SB'a hangi index'den itibaren eklenecek
        cumle : Hangi String'den eklenecek
        0 : cumle'nin hangi index'inden baslanacak
        8 : baslangic indexinden sonra kacinci index'e kadar alacak
         */
        System.out.println(sb1); // Merhaba-Rumeysa Cetintur

        sb1.insert(24, cumle, 7, 13); // 7 dahil 13 dahil degil
        System.out.println(sb1); // Merhaba-Rumeysa Cetintur Dunya

        System.out.println(sb1.lastIndexOf("t")); // 21
        System.out.println(sb1.lastIndexOf("a", 21)); // 14 (21'den onceki son "a")

        sb1.replace(8, 15, "Seher"); // Rumeysa yerine Seher yazdirdik
        System.out.println(sb1); // Merhaba-Seher Cetintur Dunya

        sb1.reverse();
        System.out.println(sb1); // aynuD rutniteC reheS-abahreM
        sb1.reverse();

        sb1.setCharAt(10, 'k');
        System.out.println(sb1); // Merhaba-Seker Cetintur Dunya

        System.out.println(sb1.subSequence(8, 13)); // Seker SB'in istedigimiz index'ler arasindakileri verir

        System.out.println(sb1.substring(8)); // Seker Cetintur Dunya

        StringBuilder sb123 = new StringBuilder("OCAJP8");

        StringBuilder sb1234 = new StringBuilder(sb123.subSequence(2, 4));

        System.out.println(sb1234); // AJ

        System.out.println(sb123); // OCAJP8

        sb123.deleteCharAt(3);

        sb123.reverse();

        System.out.println(sb123);
    }

}
