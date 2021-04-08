package day40_exceptions;

import java.util.Scanner;

public class Exceptions01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz: ");
        int yas = scan.nextInt();

        /*
        if (yas >= 0) {

            System.out.println("Girdiginiz yas: " + yas);

        } else {

            throw new IllegalArgumentException();

        }

        System.out.println("Kod bloke olmamis.");

        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
         Bu sekilde yazdigimizda Java Exception throw eder ama
        kodumuz bloke olur. Eger kodun bloke olmamasini istiyorsak
        try/catch ile surround yapariz ve throw'u kontrol etmis oluruz
        */


        try {

            if (yas >= 0) {

                System.out.println("Girdiginiz yas: " + yas);

            } else {

                throw new IllegalArgumentException();

            }

        } catch (IllegalArgumentException e) {

            e.printStackTrace();

        }

        System.out.println("Kod bloke olmamis. (try/catch surround yapilmis hali)");

    }

}
