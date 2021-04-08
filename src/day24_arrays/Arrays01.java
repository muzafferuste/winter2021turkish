package day24_arrays;

import java.util.Arrays;

public class Arrays01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int sayi1 = 10;
		int sayi2 = 20;
		int sayi3 = 30;
		String isim = "Ali";

		// Java'da birden fazla elemani koyabilecegimiz (store) object'ler vardir.
		// Bugun bunlardan ilkini ogrenecegiz!

		int arr[] = { 10, 20, 30 }; // int[] arr seklinde de kullanilabilir
									// bu ornekte Array'in elemanlarini direkt yazdigim icin uzunluk belirtmeye
									// ihtiyac kalmadi. Bu kullanimda mex eleman sayisi (length) yazdigimiz eleman
									// sayisidir. Java bunu otomatik olarak yapar

		System.out.println(arr); // Array bir objedir.
		// Eger direkt olarak array'i yazdirmak isterseniz Javareferance'i yazdirir

		System.out.println(Arrays.toString(arr)); // [10, 20, 30]

		String takim[] = new String[3]; // [null, null, null]

		System.out.println(Arrays.toString(takim));

		takim[0] = "Ali";

		System.out.println(Arrays.toString(takim)); // [Ali, null, null]

		takim[2] = "Hasan";
		takim[1] = "Veli";

		System.out.println(Arrays.toString(takim)); // [Ali, null, Hasan]

		// takim[3] = "Mehmet"; // Java RunTimeProgramming'dir dolayisiyla Array programi calistirinca
								// olusturulur. 39.satirda syntax olarak hata olmadigindan CTE olmaz
		
		// Array'daki bir elemani update etme
		// Veli'nin yerine Kemal gelsin
		
		takim[1] = "Kemal";
		
		System.out.println(Arrays.toString(takim)); // [Ali, Kemal, Hasan]
		
		// Bir Array'in uzunlugunu nasil bulabiliriz
		
		System.out.println(takim.length);
		
		// Array'deki son elemani Mehmet yapin
		
		takim[takim.length - 1] = "Mehmet";
		
		System.out.println(Arrays.toString(takim)); // [Ali, Kemal, Mehmet]
		
		// eger array'in eleman sayisi tek ise ortadaki elemani Can yapalim
		
		if (takim.length % 2 == 1) {
			
			int ortaIndex = (takim.length-1)/2;
			takim[ortaIndex] = "Can";
		}
		
		System.out.println(Arrays.toString(takim)); // [Ali, Can, Mehmet]

	}

}
