package day15_merhodCreation;

import java.util.Scanner;

public class C1_MethodCreation1 {

	public static void main(String[] args) {

		// Soru 1 ) Kullanicidan bir sayi alin.
		// Bu sayinin negatif veya pozitif oldugunu, sayinin
		// tek mi cift mi oldugunu ve
		// 3 basamakli veya daha buyukse birler, onlar ve yuzler basamagindaki rakamlarin toplamini,
		// 100�den kucukse sadece birler basamagini yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz: ");

		int sayi = scan.nextInt();

		pozitifNegatif(sayi); // girilen sayi argumentinin pozitif ya da negatif oldugunu yazdirsin

		tekCift(sayi);
		
		if (sayi >= 100) {
			
			yuzdenBuyuk(sayi);
			
		} else {
			
			yuzdenKucuk(sayi);
			
		}

		// buyukKucuk(sayi);
		
		scan.close();

	} // main method sonu

	public static void pozitifNegatif(int sayi) { // parametre yazarken data type'ini da yazmaliyiz

		System.out.println(sayi > 0 ? "Pozitif" : (sayi < 0 ? "Negatif" : "Notr"));

	} // pozitifNegatif Method sonu

	public static void tekCift(int sayi) {

		if (sayi % 2 == 0) {

			System.out.println("Sayi Cift");

		} else {

			System.out.println("Sayi Tek");

		} // ifElse sonu

	} // tekCift method sonu
	
	public static void yuzdenBuyuk(int sayi) {
		
		int rakamlarToplami = 0;
		rakamlarToplami += sayi % 10;
		sayi /= 10;
		rakamlarToplami += sayi % 10;
		sayi /= 10;
		rakamlarToplami += sayi % 10;

		System.out.println("Rakamlari toplami: " + rakamlarToplami);
		
	} // yuzdenBuyuk method sonu
	
	public static void yuzdenKucuk(int sayi) {
		
		int birler = sayi % 10;

		System.out.println("Sayinin birler basamagi: " + birler);
		
	}

	/*
	  
	public static void buyukKucuk(int sayi) {
	 

		if (sayi >= 100) {

			int birler = sayi % 10;
			int onlar = (sayi / 10) % 10;
			int yuzler = sayi / 100;

			System.out.println("Basamaklar toplami: " + (birler + onlar + yuzler));


		} else {

			int birler = sayi % 10;

			System.out.println("Sayinin birler basamagi: " + birler);

		} // ifElse sonu

	
	} // buyukKucuk method sonu

	*/

} // class sonu
