package day30_dateTime;

import java.time.LocalDateTime;

public class C3_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 2021-03-19T23:04:17.732623500
                                 // (Yil-Ay-Gun-T-Saat-Dakika-Saniye)

        String time = ldt.toString();

        System.out.println(time.startsWith("2021")); // true

    }

}
