package day24_arrays;

import java.util.Arrays;

public class Arrays05 {

	public static void main(String[] args) {
		
		// Karisik sirali verilen bir array'i sirali olarak yazdiriniz
		
		int arr[] = {25, 17, 6, 78, 45, 69, 1};
		
		Arrays.sort(arr);
				
		System.out.println(Arrays.toString(arr));
		
		// Odev1: Ayni arry'i buyukten kucuge dogru nasil yazdirabiliriz
		
		for (int i = arr.length-1; i >= 0; i--) {
			
			System.out.print(arr[i] + " ");
			
		}
		
		System.out.println();
		
		// Odev2: Ayni arry'i buyukten kucuge dogru nasil siralayabiliriz
		
		int arrTers[] = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			
			arrTers[i] = arr[arr.length-1-i];
		}
		
		System.out.println(Arrays.toString(arrTers));
		
	}

}
