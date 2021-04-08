package day08_ifElseIfNestedIf;

import java.util.Scanner;

public class C3_ArtikYil {

	public static void main(String[] args) {
		
		// kullanicidan artik yil olup olmadigini kontrol etmek icin bir yil girmesini isteyin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen artik yil olup olmadigini kontrol etmek icin bir yil giriniz: ");
		
		int yil = scan.nextInt();
		
		if ((yil%4) == 0) {
			
			if ((yil%100) != 0) {
				
				System.out.println("Artik yil. ");
				
			} else {
				
				if ((yil%400) == 0) {
					
					System.out.println("Artik yil. ");
					
				} else {
					
					System.out.println("Artik yil degil. ");
					
				}
				
			}
			
		} else {
			
			System.out.println("Artik yil degil. ");
			
		}
		
		scan.close();
		
	}

}
