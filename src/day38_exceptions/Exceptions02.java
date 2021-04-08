package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions02 {

    public static void main(String[] args) {

        // Kullanicidan 2 tamsayi alin ve bolumlerini yazdirin

        int count = 1;


        while (count <= 100) {


            try{


                Scanner scan = new Scanner(System.in);

                System.out.println("Lutfen bolunecek tamsayiyi yazin");
                int sayi1 = scan.nextInt();

                System.out.println("Lutfen kaca bolmek istediginizi yazin");
                int sayi2 = scan.nextInt();

            /* java'ya exceptions'i handle etmek icin bir cozum uretmezsek
            java exception ile karsilastiginda calismayi durdurur (stops execution)
            throws exception (exception firlatir)(problemin kaynagini bize gosterir)

            tum aplication durmus olur...
            Musterinin kullandigi bir uygulama icin bu KABUL EDILEMEZ
            BUnun icin kod yazan kisi muhtemel sorunlari ongormeli ve
            Java'ya bu sorunla handle edebilmesi icin yol gostermelidir.
            */

                System.out.println("islem no : " + count);
                // System.out.println("bolme isleminin sonucu : " + sayi1/sayi2);

                try {

                    System.out.println("bolme isleminin sonucu : " + sayi1 / sayi2);

                } catch (ArithmeticException e) {

                System.out.println("sayiyi sifira bolemezsin");
                e.printStackTrace();

            }


            } catch (InputMismatchException e) {

                System.out.println("Sadece sayi giriniz.");
                e.printStackTrace();
            }
                count++;

        }

    }
}
