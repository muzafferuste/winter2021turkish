package day02_scanner;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		
		// kullinicidan ismini ve soy ismini alip aralarinda bir bosluk birakarak ismini ve soyismini yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz: ");
		String name = scan.nextLine(); // sadece next secilirse kullanici birden fazla kelime girse bile ilk kelimeyi alir
		                           // eger kullanicidan girdigi tum yaziyi almak istersek nextLine() kullanilir
		
		System.out.println("Lutfen soyisminizi giriniz: ");
		String surname = scan.nextLine();
		
		System.out.println(name + " " + surname);
		
		scan.close();
	
	}

}
