package day06_IfStatements;

import java.util.Scanner;

public class C5_IfStatement5 {

	public static void main(String[] args) {
		
		// Kullanicidan dortgenin iki kenar uzunlugunu alin
		// Kenar uzunluklari esitse kare esit degilse dikdortgen
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki kenar uzunlugu giriniz: ");
		
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		
		if (kenar1 == kenar2 && kenar1 > 0 && kenar2 > 0) {
			
			System.out.println("Girdiginiz kenar uzunluklari bir kare'ye aittir.");
			
		}
		
		if (kenar1 != kenar2 && kenar1 > 0 && kenar2 > 0) {
			
			System.out.println("Girdiginiz kenar uzunluklari bir dikdortgene aittir. ");
			
			
		}
		
		if (kenar1 == 0 || kenar2 == 0 || kenar1 < 0 || kenar2 < 0 ) {
			
			System.out.println("Girdiginiz kenar uzunluklarina ait bir dortgen olamaz. ");
			
		}
		
		scan.close(); 
		
	}

}
