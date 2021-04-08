package day07_ifElseStatements;

import java.util.Scanner;

public class C3_IfElse2 {

	public static void main(String[] args) {
		
		// Kullanicidan bir karekter girmesini isteyin
		// Harf olup olmadigini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir karakter giriniz: ");
		
		char harf = scan.next().toLowerCase().charAt(0);
		
		if (harf >= 'a' && harf <= 'z') {
			
			System.out.println("Girdiginiz karakter harftir.");
			
		} else {
			System.out.println("Girdiginiz karakter harf degildir.");
		}
		
		scan.close();
		
	}

}
