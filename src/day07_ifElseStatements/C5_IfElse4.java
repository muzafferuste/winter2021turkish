package day07_ifElseStatements;

import java.util.Scanner;

public class C5_IfElse4 {

	public static void main(String[] args) {
		
		// Kullanicidan ucgenin kenar uzunluklarini alin
		// Uc kenar da esitse "Eskenar" yazdirin degilse "Eskenar degil" yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen uc kenar uzunlugu giriniz: ");
		
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		double kenar3 = scan.nextDouble();
		
		if (kenar1 == kenar2 && kenar2 == kenar3) {
			
			System.out.println("Girdiginiz kenar uzunluklarina ait ucgen Eskenar'dir.");
			
		} else {
			
			System.out.println("Girdiginiz kenar uzunluklarina ait ucgen Eskenar degildir.");
			
		}
		
		scan.close();
	
	}

}
