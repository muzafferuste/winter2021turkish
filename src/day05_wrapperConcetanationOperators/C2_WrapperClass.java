package day05_wrapperConcetanationOperators;

public class C2_WrapperClass {

	public static void main(String[] args) {
		
		/* Java da 2'tur data type vardi: Primitive ve Non-Primitive
		 * Primitive data type'lar sadece value(deger) icerir
		 * Non-Primitive data type'lar ise value ile beraber methodlar da icerir
		 */
		
		String isim = "Muzaffer";
		
		System.out.println(isim.toUpperCase());
		
		/* Wrapper Class:
		 * Java'nin primitive data type'leri icin bazi methodlari kullanabilmemiz icin olusturdugu Class'lardir.
		 */
		
		/* Primitive Data Type'leri:
		 * boolean, char, byte, short, int, long, float, double
		 */
		
		byte sayi = 10;
		System.out.println(sayi);
		
		Byte sayi2 = 11; // ismen primitve data type'lar ile ayni olan non-primitive data type'lara Wrapper denir.
		
		System.out.println(sayi2);
		
		Byte byteMinSayi = Byte.MIN_VALUE;
		System.out.println(byteMinSayi);
		
		Byte byteMaxSayi = Byte.MAX_VALUE;
		System.out.println(byteMaxSayi);
		
		// Variable olusturmadan direkt olarak short'un en kucuk ve en buyuk degerlerini yazdiralim
		System.out.println("Short'un Min degeri: " + Short.MIN_VALUE + " Max Degeri: " + Short.MAX_VALUE);
		
		// Integer data Type'in Wrapper Class'i ==> Integer
		// Integer'in en kucuk ve en buyuk degerini yazdirin: 
		System.out.println("Integer min degeri: " + Integer.MIN_VALUE + " Max degeri: " + Integer.MAX_VALUE);
		
		/* Wrapper Class Isimleri:
		 * Boolean, Character, Byte, Short, Integer, Long, Float, Double
		 */
		
	}

}
