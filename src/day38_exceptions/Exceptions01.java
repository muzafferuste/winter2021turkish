package day38_exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions01 {

    public static void main(String[] args) {

        // Kullanicidan 2 tamsayi alin ve bolumlerini yazdirin


        Scanner scan = new Scanner(System.in);



        System.out.println("Lutfen bolunecek tamsayiyi yazin");
        int sayi1 = scan.nextInt();

        System.out.println("Lutfen kaca bolmek istediginizi yazin");
        int sayi2 = scan.nextInt(); // 0


        // java exceptions'i handle etmek icin try-catch blogu olusturmus.

        System.out.println("Bolme isleminin sonucu : " + sayi1 / sayi2);

        /*
        try {



        } catch (ArithmeticException e) {

            System.out.println("Sayiyi sifira bolemezsin");

        } catch (InputMismatchException e) {

            System.out.println("Sadece sayi giriniz.");
        }

         */

    }

}
