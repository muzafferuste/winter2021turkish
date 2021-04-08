package day06_IfStatements;

import java.util.Scanner;

public class C2_IfStatement2 {
	
	public static void main(String[] args) {
		
		// kullanicidan bir sayi isteyin ve sayinin tek mi cift mi olduygunu hazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir tam sayi giriniz: ");
		
		int sayi = scan.nextInt();
		
		// 153 % 2 == 0 ==> sayi cifttir
		// 153 % 2 == 1 ==> sayi tektir
		
		if (sayi % 2 == 0) {
			
			System.out.println(sayi + " Sayisi cift sayidir. 2 ile bolumunden kalan: " + sayi % 2 + "'dir." );
			
		}
		
		if (sayi % 2 == 1 || sayi % 2 == (-1)) {
			
			System.out.println(sayi + " Sayisi tek sayidir. 2 ile bolumunden kalan: " + sayi % 2 + "'dir." );
			
		}
		
		System.out.println("Katilim gosterdiginiz icin tesekkur ederiz.");
		
		
		
		scan.close();
		
	}

}
