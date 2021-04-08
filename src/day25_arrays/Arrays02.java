package day25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {

		// Verilen bir Array'de bir elemanin var olup olmadigini kontrol etme

		int arr[] = { 10, 25, 3, 16, 75 };

		int sayi = 25;

		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == sayi) {

				flag = true;
			}
		}

		if (flag) {

			System.out.println("Array sorulan elemani iceriyor.");
		} else {

			System.out.println("Array sorulan elemani icermiyor.");
		}

		// Arrays class'indan method kullanarak yapalim
		// ilk once siralama yapmaliyiz

		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

		Arrays.binarySearch(arr, sayi); // Sonuc olarak true veya false degil aranan sayinin index'ini doner

		System.out.println(Arrays.binarySearch(arr, sayi)); // Sayi 25 sayisini iceriyor ise index'ini yazdirir ==> 3

		System.out.println(Arrays.binarySearch(arr, 10)); // 1

		System.out.println(Arrays.binarySearch(arr, 28)); // sayinin tahmini olarak olmasi gereken yeri
															// negative olarak yazdirir -5

		System.out.println(Arrays.binarySearch(arr, 5)); // -2

		System.out.println(Arrays.binarySearch(arr, 100)); // -6

		// BinarySearch sonuc olarak aradigimiz eleman varsa index'ini verir
		// Aradigimiz eleman yoksa " - " isareti ile olsaydi kacinci eleman olacagini
		// dondurur

		int arr2[] = { 12, 15, 25, 14, 3, 12, 65 };

		Arrays.sort(arr2);

		System.out.println(Arrays.toString(arr2)); // [3, 12, 12, 14, 25, 65]

		System.out.println(Arrays.binarySearch(arr2, 14)); // 3

		System.out.println(Arrays.binarySearch(arr2, 20)); // -6

		System.out.println(Arrays.binarySearch(arr2, 12)); // 1

		System.out.println(Arrays.binarySearch(arr2, 2)); // -1

		// Array nasil String'e cevrilir

		String arrString = Arrays.toString(arr2);
		System.out.println(arrString);

		System.out.println(arrString.substring(5)); // Bastaki koseliParantez dahil tum Array'i String'e cevirir

	}

}
