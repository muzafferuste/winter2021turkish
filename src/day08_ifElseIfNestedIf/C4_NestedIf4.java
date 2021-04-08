package day08_ifElseIfNestedIf;

import java.util.Scanner;

public class C4_NestedIf4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen sifrenizi girin: ");
		
		char ilkHarf = scan.next().charAt(0);
		
		if (ilkHarf >= 'A' && ilkHarf <= 'Z'  ) { // ilk harf buyuk harf ise
			
			if (ilkHarf == 'A') {
				
				System.out.println("Sifre Gecerli!");
				
			} else {
				System.out.println("Sifre Gecersiz!");
			}
			
		} else if (ilkHarf >= 'a' && ilkHarf <= 'z' ){ // ilk harf kucuk harf ise
			
			if (ilkHarf == 'z') {
				
				System.out.println("Sifre Gecerli!");
				
			} else {
				
				System.out.println("Sifre Gecesiz!");
				
			}
			
		} else { // ilk harf buyuk harf veya kucuk harf degilse
			
			System.out.println("Sifre Gecersiz!");
			
		}
		
		scan.close();
		
	}

}
