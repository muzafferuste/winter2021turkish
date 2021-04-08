package day05_wrapperConcetanationOperators;

public class C5_ConditionalOperators {

	public static void main(String[] args) {
		
		// AND ==> && , OR ==> ||
		
		// && ==> Mukemmelliyetcidir. Sonucun true olmasi icin tum islemlerin true olmasi gerekir. 
		// bir tane false varsa sonucu false yazdirir
		
		boolean isTrue = 5 > 4 && 7 - 3 > 0;
		System.out.println(isTrue);
		
		int x = 10;
		int y = 5;
		
		System.out.println(x/y == 2 && x*y > 20 && x-y > 0); // true && true && true ==> true
		System.out.println(x/y == 2 && x*y > 20 && x-y < 0); // true && true && false ==> false
		
		// || ==> Bagli islemlerden bir tanesi bile true olursa sonucu true yazdirir. Yarabbi sukur der
		
		System.out.println(x < y || x+y < 0 || x*y > 0); // false || false || true ==> true
		
		
	}

}
