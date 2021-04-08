package day07_ifElseStatements;

import java.util.Scanner;

public class C6_IfElseIf1 {

	public static void main(String[] args) {
		
		// Kullanicidan bir not girmesini isteyin
		/*
		 * 50'den kucukse "D"
		 * 50-60 arasi "C"
		 * 60-80 arasi "B"
		 * 80'den buyukse "A"
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen notunuzu giriniz: ");
		
		double not = scan.nextDouble();
		
		if (not < 0 || not > 100) { // istenmeyen durum
			
			System.out.println("Lutfen gecerli bir not giriniz!");
			
		}
		
		else if (not < 50) { // notunuz 0 ile 50 arasinda
			
			System.out.println("Harf notunuz: D");
			
		}
		
		else if (not < 60) { // notunuz 50 ile 60 arasinda
			
			System.out.println("Harf notunuz: C");
			
		}
		
		else if (not < 80) { // nutunuz 60 ile 80 arasinda
			System.out.println("Harf notunuz: B");
			
		}
		
		else { // notunuz 80 ile 100 arasinda
			
			System.out.println("Harf notunuz: A");
			
		}
		
		scan.close();
		
	}

}
