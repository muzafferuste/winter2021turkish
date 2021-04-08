package day05_wrapperConcetanationOperators;

public class C4_OperatorSigns {

	public static void main(String[] args) {
		
		// = atama / assigment isareti
		
		int sayi1 = 5;
		int sayi2 = 4;
		
		boolean isGreat = sayi1>sayi2; // true/false?
		System.out.println(isGreat); // true
		
		boolean isSmall = sayi1 <= sayi2; // true/false?
		System.out.println(isSmall); // false
		
		boolean isEqual = sayi1 == sayi2; // == esit mi? Comparison(Karsilastirma) operatoru
		System.out.println(isEqual); // false
		
		System.out.println(sayi1 == 5); // true
		
		System.out.println((sayi1 * sayi2) == 20); // true
		
		System.out.println(sayi1 != sayi2); // true
		
		// tum matematiksel ifadelerde ! kullanildiginda olumsuzluk anlami katar
		
	}

}
