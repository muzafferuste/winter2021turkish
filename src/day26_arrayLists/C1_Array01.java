package day26_arrayLists;

import java.util.Arrays;

public class C1_Array01 {
    public static void main(String[] args) {

        /* Soru 6:
         Verilen bir Array'den istenen degere esit olan elemanlari kaldirip
         kalanlari yeni bir Array olarak yazdiran bir method yaziniz
         */

        int arr[] = {2, 3, 5, 3, 6, 4, 3, 6, 7};
        int sayi = 6;

        // 1.adim olarak arr icinde kaldirilmak istenen sayi kac tane var bunu bulmamiz gerekiyor

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == sayi) {
                count++;
            }
        }

        // 2.adim yeni Array olusturalim

        int[] arr2 = new int[arr.length-count];

        /* 3.adim arr[]'den elemanlari tek tek alip istenen sayiya esit degilse
        arr2[]'ye ekleyecegiz
         */

        int temp=0; // bununla yeni array'in indexlerini kontrol edecegim
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]!=sayi) {
                arr2[temp]=arr[i];
                temp++;
            }

        }

        System.out.println(Arrays.toString(arr2));

    }
}
