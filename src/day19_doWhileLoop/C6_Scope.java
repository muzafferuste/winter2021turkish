package day19_doWhileLoop;

public class C6_Scope {
	
	// Bir class icerisinde olusturulan variable'larin nerede gecerli oldugu
	// ve nerede kullanabilindigini o variable'in Scope'u belirler
	// Odev: Scop nedir?

	public static void main(String[] args) {
		
		int sayi = 10;
		
		denemeMethod();
		
		sayi++;
		System.out.println(sayi);
		
		// System.out.println(isim);
	}

	public static void denemeMethod() {
		
		// sayi = 20;
		
		String isim = "Mehmet";
		System.out.println(isim);
	}

}
