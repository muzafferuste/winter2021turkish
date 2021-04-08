package day10_switchCase;

import java.util.Scanner;

public class C2_TernaryTekrar2 {

	public static void main(String[] args) {
		
		// kullanicidan bir sayi alin
		// sayi cift ise "cift" yazdirin
		// degilse sayinin karesini yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz: ");
		
		int sayi = scan.nextInt();
		
		// eger ternary'de iki durum icin farkli data tipleri donusu oluyorsa
		// ya variable'a atama yapmadan direkt yazdiririz
		// ya da mumkunse sonuclari ayni data tipine cevirmeye calisiriz
		
		String sonuc = sayi%2 == 0 ? "cift" : sayi*sayi+"";
		System.out.println(sonuc);
		
		scan.close();
		
	}

}
