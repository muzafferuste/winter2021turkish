package day06_IfStatements;

public class C1_IfStatement1 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 8;
		
		if (a > b) { //true
			
			System.out.println("Ilk sayi buyuktur.");
			
		}
		
		if (a*b < 0) { // false
			
			System.out.println("Sayilarin carpimi negatiftir.");
			
		}
		
		if (a < b || b > 0) { // false || true ==> true
			
			System.out.println("||'lu cumle calisti");
			
		}
		
		if (a-b > 0 && a*b > 0) { // true && true ==> true
			
			System.out.println("&&'li cumle calisti");
			
		}
		
	}

}
