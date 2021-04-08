package day10_switchCase;

import java.util.Scanner;

public class C5_SwitchCase3 {
	
	public static void main(String[] args) {
		
		// kullanicidan hangi gunde oldugumuzu isteyin (yaziyla)
		// girilen gunun hafta ici veya hafta sonu olup olmadigini kontrol edin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen hangi gunde oldugunuzu yaziniz: ");
		
		String gun = scan.next().toLowerCase();
		
		switch (gun) {

		case "pazartesi":
			
		case "sali":
			
		case "carsamba":
		
		case "persembe":
			
		case "cuma":
			System.out.println("Hafta ici");
			break;

		case "cumartesi":
			
		case "pazar":
			System.out.println("Temmuz");
			break;

		default:
			System.out.println("Girdiginiz deger hic bir gune ait degil!");
			break;

		}

		scan.close();
		
	}

}
