package day13_stringManipulation;

import java.util.Scanner;

public class C9_Examples3 {
	
	public static void main(String[] args) {
		
		/* Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin
		 * isim - soyisim : M***** U***
		 * kart no: **** **** **** 1234
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz: ");
		String isim =scan.nextLine();
		
		System.out.println("Lutfen soyisminizi giriniz: ");
		String soyisim =scan.next();
		
		System.out.println("Lutfen kart no giriniz: ");
		String kartNo =scan.next();
		
		char isimIlkHarf = isim.toUpperCase().charAt(0);
		String isimKalan = isim.substring(1).replaceAll("\\w", "*");
		
		String soyisimIlkHarf = soyisim.toUpperCase().substring(0, 1);
		String soyisimKalan = soyisim.substring(1).replaceAll("\\w", "*");
		
		String kartNoBasi = "**** **** **** ";
        String kartNoSonu = kartNo.substring(kartNo.length() -4);
        
		System.out.println("isminiz ve soyisminiz: " + isimIlkHarf + isimKalan + " " + soyisimIlkHarf + soyisimKalan);
		System.out.println("Kart No: " + kartNoBasi + kartNoSonu);
		
		scan.close();
		
	}

}
