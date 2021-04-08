package day15_merhodCreation;

import java.util.Scanner;

public class C2_MethodCreation2 {

	public static void main(String[] args) {

		/*
		 * Kullaniciya kac sayi toplamak istedigini sorun. Kullanici 2, 3 veya 4 degerini
		 * girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini
		 * yazdirin. Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse “Cok
		 * sayi girdiniz, ben toplayamam” yazdirin.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kac adet sayiyi toplamak istediginizi giriniz: ");
		
		int adet = scan.nextInt();
		
		if (adet < 2) {
			
			System.out.println("En az 2 sayi girmelisiniz! ");
			
		} else if (adet == 2) {
			
			ikiSayiTopla();
			
		} else if (adet == 3) {
			
			ucSayiTopla();
			
		} else if (adet == 4) {
			
			dortSayiTopla();
			
		} else {
			
			System.out.println("Cok fazla adet girdiniz, bu islem gerceklestirilemez!");
			
		}
		
		scan.close();

	}

	private static void ikiSayiTopla() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki sayi giriniz: ");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		double sonuc = sayi1 + sayi2;
		System.out.println("Isleminizin sonucu: " + sonuc);
		
		scan.close();
		
	}

	private static void ucSayiTopla() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen uc sayi giriniz: ");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		double sayi3 = scan.nextDouble();
		
		double sonuc = sayi1 + sayi2 + sayi3;
		System.out.println("Isleminizin sonucu: " + sonuc);
		
		scan.close();
		
	}

	private static void dortSayiTopla() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen dort sayi giriniz: ");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		double sayi3 = scan.nextDouble();
		double sayi4 = scan.nextDouble();
		
		double sonuc = sayi1 + sayi2 + sayi3 + sayi4;
		System.out.println("Isleminizin sonucu: " + sonuc);
		
		scan.close();
		
	}

}
