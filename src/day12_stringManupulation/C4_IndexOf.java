package day12_stringManupulation;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		
		// IndexOf() method'u bize istedigimiz karakter(ler)in indexini dondurur
		
		String str = "Java ogren, is sahibi ol";
		
		System.out.println(str.charAt(6)); // g
		
		System.out.println("char arama: " + str.indexOf('g')); // 6
		
		System.out.println("String arama: " + str.indexOf("is")); // i == 12, s == 13 ==> 12
		
		System.out.println("Birden fazla varsa: " + str.indexOf('i')); // ilk buldugunun index'i ==> 12
		
		System.out.println("Baslangic index'i ile: " + str.indexOf('a', 3)); // baslangic index'i inclusive
		
		System.out.println("Baslangic index'i ile (2): " + str.indexOf('a', 4)); // 4.index' den sonraki a'nin index'i ==> 16
		
		System.out.println("olmayan harf: " + str.indexOf("dert"));
		
		// kullanicidan bir cumle isteyin
		// case sensitive olmadan Java kelimesi icerip icermedigini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz: ");
		
		String cumle = scan.nextLine().toLowerCase();
		
		int sonuc = cumle.indexOf("java");
		
		System.out.println("index'i: " + sonuc);
		
		System.out.println(sonuc == -1 ? "Icermez" : "Icerir");
		
		scan.close();
		
	}

}
