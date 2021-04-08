package day07_ifElseStatements;

import java.util.Scanner;

public class C2_IfElse1 {

	public static void main(String[] args) {
		
		// kullanicidan dortgenin kenar uzunluklarini alin
		// uzunluklar esit ise "Kare" degilse "Kare Degil" yazdiralim
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki kenar uzunlugu giriniz: ");
		
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		
		if (kenar1 == kenar2) {
			
			System.out.println("Girdiginiz uzunluklar bir Kare'ye aittir.");
			
		} else {
			
			System.out.println("Girdiginiz uzunluklar bir Kare'ye ait degildir.");
			
		}
	
		scan.close();
		
	}

}
