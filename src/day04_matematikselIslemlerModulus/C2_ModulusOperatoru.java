package day04_matematikselIslemlerModulus;

public class C2_ModulusOperatoru {

	public static void main(String[] args) {
		
		// modules operatoru bolme isleminde kalani verir
		
		/* 15 Tek sayi midir cift sayi mi?
		 Tekdir cunku 2 ye bolumunden kalan 1 dir.
		* 25 uce bolunur mu? 25/3 kalan=1 kalan sifir olmadigi icin bolunmez
		* bir sayinin 7 ile bolunebilirligini kontrol etmek icin modulus operatoru kullanilir
		*/
		
		int kalan = 15 % 4;
		System.out.println(kalan); // 3
		
		System.out.println(26 % 8); // 2
		
		
		// 856 sayisinin birler basamagi kactir? ==> 6
		
		int sayi = 856;
		System.out.println("sayi: " + sayi);
		
		int birlerBasamagi = sayi % 10;
		System.out.println("sayinin birler basamagi: " + birlerBasamagi);
		
		
		//856 sayisinin onlar basamagi kactir? ==> 5
		
		sayi /= 10; // 85
		System.out.println("10'a bolundukten sonra sayinin degeri: " + sayi);
		
		int onlarBasamagi = sayi % 10;
		System.out.println("sayinin onlar basamagi: " + onlarBasamagi);
		
		
		// 856 sayisinin yuzler basamagi kactir? ==> 8
		
		sayi /= 10;
		System.out.println("Sayinin 2.kez 10'a bolumundukten sonraki degeri: " + sayi);
		
		int yuzlerBasamagi = sayi % 10;
		System.out.println("Sayinin yuzler basamagi: " + yuzlerBasamagi);
		
		
	}

}
