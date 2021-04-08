package day14_methodCreation;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		
		// bir method'u calistirmak icin main method'un icinden cagirmamiz gerekir.
		// bir method'u cagirmak icin method adini ve parametrelere uygun argumentleri yazmaliyiz.
		double num1 = 87.2;
		double num2 = 88.2;
		double ortalama = (num1 + num2) / 2;
		System.out.println("ortalama duz yol: " + ortalama);
		
		String str1 = "muzaffer";
		str1.charAt(0);
		
		ortalama(85.2, 90.3);
		
	} // Main method sonu
	
	// Bir method olusturmak istedigimizde Class'in icinde ama main method'un disinda
	// bir alanda olusturmaliyiz. Genel kullanim method'lar main method'dan sonra olur
	
	public static void ortalama(double sayi1, double sayi2) {
		
		System.out.println("Girdiginiz iki sayinin ortalamsi: " + ((sayi1 + sayi2) / 2));
		
		/* Bir methodu olusturmak o method'u calistirmaya yeterli degildir.
		 * Olusturulan method main method icinden cagirilinca calisir.
		 */
		
	} // ortalama method'u sonu
	
} // Class sonu
