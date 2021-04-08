package day25_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		/* Array (Dizi): Java'da birden fazla 
		 * 
		 */
		
		int arr[] = {120, 23, 54}; // length = 3
		String isimler[] = new String[4]; // length = 4
		
		System.out.println(isimler[1]);
		
		isimler[2] = "Boss";
		isimler[0] = "Elveda";
		
		// Array'in tum elemanlarini yazdirma
		
		System.out.println(isimler); // referansini yazdirir
		System.out.println(Arrays.toString(isimler)); // [Elveda, null, Boss, null]
		
		// Method kullanmadan tum elemanlari yazdiralim
		// loop kullanmamiz lazim
		
		for (int i = 0; i < isimler.length; i++) {
			
			System.out.print(isimler[i] + " ");
		}
		
		System.out.println();
		
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		// Array'in elemanlarini nasil siralariz
		
		isimler[1] = "Oguzhan";
		isimler[3] = "Bilal";
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));
		
	}

}
