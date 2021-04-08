package day11_stringManipulations;

public class C2_CharAt {

	public static void main(String[] args) {
		
		// charAt(index)
		// scan.next().charAt(0) 0. index'deki character'i verir
		// index 1'den degil 0'dan baslar
		
		String str = "Java cok guzel";
		System.out.println(str.charAt(0)); // J
		
		System.out.println(str.charAt(5)); // c
		
		System.out.println(str.charAt(13)); // l
		// kelimenin uzunlugu son index + 1'dir
		// son index kelimenin uzunlugu(length) -1
	    // kullanici 10 character'li bir kelime girerse abcd efghi
		// bana son harfi verecek kodu yaziniz : str.charAt(9)
		
		// System.out.println(str.charAt(15)); // EXCEPTION verir
		// eger index olarak String'in uzunlugu veya daha buyuk bir sayi girilirse EXCEPTION VERIR!

		/* String str3 = 5; Compile Time Error(CTE) 
		  * Kod calismadan Java'nin farkina varip altini kirmizi cizdigi hatadir
		  * Derleme Zaman Hatasi
		  */ 
		
		/*
		 *  System.out.println(str.charAt(15)); bazi hatalar syntax'den anlasilmaz, 
		 *  ancak kod run edildikten sonra Java islemi yaparken anlasilir
		 *  Code run edildiginde ortaya ciktigi icin bu tur hatalara Run Time Error(RTE) denir
		 */
		
	}

}
