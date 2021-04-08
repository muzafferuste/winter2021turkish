package day17_forLoop;

import java.util.Scanner;

public class C4_NestedForLoop {

	public static void main(String[] args) {
		
		/*
		 * Kullanicidan pozitif bir rakam girmesini isteyin ve 
		 * girilen rakam'a gore asagidaki sekli cizdirin
		 * 
		 * *
		 * * *
		 * * * *
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("10'dan kucuk pozitif bir tam sayi giriniz: ");
		
		int sayi = scan.nextInt();
		
		for (int i = 1; i <= sayi; i++) {
			
			System.out.println();
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print("* ");
			}
			
		}
		
		scan.close();
		
	}

}
