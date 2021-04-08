package day07_ifElseStatements;

import java.util.Scanner;

public class C8_IfElseIf3 {

	public static void main(String[] args) {
		
		// Kullanicidan bir maas teklifi alalim
		
		/* teklif 80.000 in uzerindeyse "Kabul edildi"
		 * 60.000 - 80.000 arasindaysa "Konusabiliriz"
		 * 60.000 in altinda ise "Maalesef Kabul Edemem"
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen maas teklifinizi giriniz: ");
		
		double teklif = scan.nextDouble();
		
		if (teklif > 80000) {
			
			System.out.println("Verdiginiz teklifi kabul ediyorum. ");
			
		}
		
		else if (teklif > 60000) {
			
			System.out.println("Konusabiliriz.");
			
		}
		
		else {
			
			System.out.println("Uzgunum teklifiniz kabul edemeyecem. ");
			
		}
		
		scan.close();
		
	}

}
