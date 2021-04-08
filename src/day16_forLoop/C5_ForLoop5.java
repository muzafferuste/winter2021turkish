package day16_forLoop;

import java.util.Scanner;

public class C5_ForLoop5 {

    public static void main(String[] args) {

        /* Interview Question
         * Kullanicidan 100'den kucuk bir tam sayi isteyin.
         * !'den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
         * Sayi 3'un kati ise sayi yerine "Java" yazdirin.
         * Sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin.
         * Sayi hem 3'un hem 5'in kati ise sayi yerine "Java guzeldir" yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk pozitif bir tam sayi giriniz: ");

        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 15 == 0) {

                System.out.println("Java guzeldir ");

            } else if (i % 3 == 0) {

                System.out.print("Java ");

            } else if (i % 5 == 0) {

                System.out.print("Guzeldir ");

            } else {

                System.out.print(i + " ");

            }

        }

        scan.close();

    }

}
