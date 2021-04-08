package day30_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C2_LocalTime {

    public static void main(String[] args) {

        /* Java'da saat ile islem yapmak icin
        LocalTime class'indan obje kullaniriz
        */

        LocalTime saat = LocalTime.now();
        System.out.println(saat); // 22:38:30 (Her calistirmada degisecek)

        for (int i = 1; i <1000000 ; i++) {

            i+=1;
        }

        LocalTime saat2 = LocalTime.now();
        System.out.println(saat2);

        System.out.println(saat.plusHours(15)); // Simdiki saatin uzerine 15 saat ekler

        System.out.println(saat.minusSeconds(154546561)); // 154546561 saniye onceki saat

        System.out.println(saat.now(ZoneId.of("Japan")));
        System.out.println(saat.now(ZoneId.of("America/Chicago")));

    }

}
