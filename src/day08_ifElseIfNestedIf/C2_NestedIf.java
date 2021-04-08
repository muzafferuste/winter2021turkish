package day08_ifElseIfNestedIf;

public class C2_NestedIf {

	public static void main(String[] args) {

		/*
		 * Verilen cinsiyet ve yas icin kisinin emekli olup olmayacagini yazdiran bir
		 * program yaziniz. Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli
		 * olabilir erkek ise 65 yasindan buyukse emekli olabilir
		 */

		String cinsiyet = "erkek";
		int yas = 65;
		
		if (yas < 0) {
			
			System.out.println("Yas negatif olamaz");
			
		}

		else if (cinsiyet.equalsIgnoreCase("erkek") && yas >= 65) {

			System.out.println("Emekli olabilirsiniz.");

		}

		else if (cinsiyet.equalsIgnoreCase("erkek") && yas < 65) {

			System.out.println("Emekli olamazsiniz.");

		}

		else if (cinsiyet.equalsIgnoreCase("kadin") && yas >= 60) {

			System.out.println("Emekli olabilirsiniz.");

		}

		else if (cinsiyet.equals("kadin") && yas < 60) {

			System.out.println("Emekli olamazsiniz.");

		}

		else {

			System.out.println("Cinsiyet veya yas tanimsiz.");

		}
		
		System.out.println("Nested if ile sonuc: ");
		
		if (cinsiyet.equalsIgnoreCase("erkek")) {
			
			if (yas < 0) {
				
				System.out.println("Yas negatif olamaz.");
				
			} else if (yas >= 65) {
				
				System.out.println("Emekli olabilirsiniz.");
				
			} else{
				
				System.out.println("Emekli olamazsiniz.");

			}
			
		} else if (cinsiyet.equalsIgnoreCase("kadin")) {
			
			if (yas < 0) {
				
				System.out.println("Yas negatif olamaz.");
				
			} else if (yas >= 60) {
				
				System.out.println("Emekli olabilirsiniz.");
				
			} else {
				
				System.out.println("Emekli olamazsiniz.");

			}
			
		} else {
			
			System.out.println("yazdiginiz cinsiyet sisteme kayitli degildir.");
			
		}

	}

}
