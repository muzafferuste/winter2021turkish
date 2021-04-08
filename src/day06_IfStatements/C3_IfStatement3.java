package day06_IfStatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		
		// Kullanicidan gun ismini alip ilk harfini isteyin ve harfe uygun olan gun isimlerini yazdirin
		// c --> cuma. cumartesi
		// s --> sali
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen gunleri listelemek icin bir harf giriniz: ");
		
		char ilkHarf = scan.next().toUpperCase().charAt(0);
		
		if (ilkHarf == 'P') {
			
			System.out.println("Pazar, Pazartesi veya Persembe");
			
		}
		
		if (ilkHarf == 'S') {
			
			System.out.println("Sali");
			
		}
		
		if (ilkHarf == 'C') {
			
			System.out.println("Carsamba, Cuma veya Cumartesi");
			
		}
		
		if (ilkHarf != 'P' && ilkHarf != 'S' && ilkHarf != 'C') {
			
			System.out.println("Girdiginiz harf ile baslayan herhangi bir gun bulunmamaktadir. ");
			
		}
		
		System.out.println("Uygulamamizi kullandiginiz icin tesekkur ederiz");
		
	scan.close();
	
	}

}
