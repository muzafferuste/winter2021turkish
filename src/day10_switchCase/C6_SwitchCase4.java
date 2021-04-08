package day10_switchCase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		
		// kullanicidan VIP kisaltmasinda hangi harfin anlamini istedigini soralim
		// girilen harfin aciklamasini yazdiralim
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen VIP kisaltmasindan hangisinin acilimini istediginizi giriniz: ");
		
		String harf = scan.next().toLowerCase();
		
		switch (harf) {

		case "v":
			System.out.println("VERY");
			break;

		case "i":
			System.out.println("IMPORTANT");
			break;

		case "p":
			System.out.println("PERSON");
			break;
		
		default:
			System.out.println("Girdiginiz deger gecerli bir harf degil!");
			break;

		}
		
		scan.close();
		
	}

}
