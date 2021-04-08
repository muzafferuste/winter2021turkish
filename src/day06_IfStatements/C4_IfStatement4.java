package day06_IfStatements;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		
		// kullanicidan gun ismi isteyin
		// girilen gunun hafta ici veya hafta sonu oldugunu yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir gun giriniz: ");
		
		String gunIsmi = scan.next().toLowerCase();
		
		// Eger String'lerde esitlik sorguluyorsak == operatorunu kullanmamaliyiz
		// String'lerde esit olma durumunu sorgulamak icin equals() kullaniyoruz
		
		if (gunIsmi.equals("pazartesi")  || gunIsmi.equals("sali")  || gunIsmi.equals("carsamba")|| gunIsmi.equals("persembe") 
				|| gunIsmi.equals("cuma")) {
			
			System.out.println(gunIsmi + " Gunu Hafta icine denk gelen bir gundur. ");
			
		}
		
		if (gunIsmi.equals("cumartesi") || gunIsmi.equals("pazar")) {
			
			System.out.println(gunIsmi + " Gunu hafta sonuna denk gelmen bir gundur. ");
			
			
		}
		
		System.out.println("Uygulamamizi kullandiginiz icin tesekkur ederiz. ");
		
		scan.close();
		
	}

}
