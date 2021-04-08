package day39_exceptions;

import java.util.Scanner;

public class Exceptions08 {

    public static void main(String[] args) {

        /* Kullanicidan carpma yapmak icin bir String isteyin
        Kullanicinin girdigi String sadece sayilardan olusuyorsa
        sayiyi 2 ile carpin ve sonucu yazdirin
        * Kullanici sayilardan olusmayan bir String girerse
        "Girdiginiz String sayiya cevrilemez" yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen carpma islemi icin sadece sayilardan olusan bir String ifade giriniz: ");
        String str = scan.nextLine();

        try {

            int strSayi = Integer.parseInt(str);
            System.out.println("Islemin sonucu: " + (strSayi * 2));

        } catch (NumberFormatException e) {

            System.out.println("Girdiginiz String sayiya cevrilemez");

        }

    }

}
