package day10_switchCase;

import java.util.Scanner;

public class C3_SwitchCase1 {

	public static void main(String[] args) {

		// Kullanicidan bir rakam isteyin.
		// Girilen rakam'i yazi ile yazdirin
		// Lutfen ifElse kullanarak yapiniz.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir rakam giriniz: ");

		int rakam = scan.nextInt();

		if (rakam >= 0 && rakam <= 10) {
			
			if (rakam == 0) {

				System.out.println("Sifir");
			}

			else if (rakam == 1) {

				System.out.println("Bir");
			}

			else if (rakam == 2) {

				System.out.println("Iki");
			}

			else if (rakam == 3) {

				System.out.println("Uc");
			}

			else if (rakam == 4) {

				System.out.println("Dort");
			}

			else if (rakam == 5) {

				System.out.println("Bes");
			}

			else if (rakam == 6) {

				System.out.println("Alti");
			}

			else if (rakam == 7) {

				System.out.println("Yedi");
			}

			else if (rakam == 8) {

				System.out.println("Sekiz");
			}

			else {

				System.out.println("Dokuz");
			}

		} else {

			System.out.println("Girdiginiz deger rakam degil!");

		}

		scan.close();
		
		// Ayni uygulamyi Switch Case Statements ile yapiniz
		
		switch (rakam) {
		
		case 0: 
			System.out.println("Sifir");
			break;
			
		case 1: 
			System.out.println("Bir");
			break;
			
		case 2: 
			System.out.println("Iki");
			break;
			
		case 3: 
			System.out.println("Uc");
			break;
			
		case 4: 
			System.out.println("Dort");
			break;
			
		case 5: 
			System.out.println("Bes");
			break;
			
		case 6: 
			System.out.println("Alti");
			break;
			
		case 7: 
			System.out.println("Yedi");
			break;
			
		case 8: 
			System.out.println("Sekiz");
			break;
			
		case 9: 
			System.out.println("Dokuz");
			break;

		default: // else gibi geriye kalan tum durumlar icin gecerlidir
			System.out.println("Girdiginiz deger rakam degil!");
			break;
		}
		
	}

}