package day25_arrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		int arr[][] = { { 1, 3, 5 }, { 3, 5 }, { 5, 9, 11, 3 } };

		// 11'i index ile ifade etmek istersenek arr[2][2]

		// eger Array'i uzunlukla declare etmek istersek inner array uzunluklari esit
		// olmali

		int arr2[][] = new int[3][2];
		// [3] ilk yazilan sayi outer array'in icinde kac tane inner array oldugunu
		// belirler
		// [2] her bir inner array'in uzunlugunu belirler

		System.out.println(Arrays.toString(arr2));

		/* MultiDimensionalArray'leri yazdirmak icin toString() kullanilamaz
		 Cunku toString() outerArray'i String'e cevirir
		 * OuterArray'in icinde innerArray'ler oldugundan toString() inner Array'lerin
		 referans degerlerini yazdirir
		 */
		System.out.println(Arrays.deepToString(arr2));

	}

}