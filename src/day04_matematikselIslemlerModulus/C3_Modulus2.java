package day04_matematikselIslemlerModulus;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		
		// kullanicidan 4 basamakli bir sayi alalim ve sayinin basamaklarini ters sirada yazdiralim
		
		Scanner scan = new Scanner(System.in);
	    System.out.print("Lutfen 4 basamakli bir tam sayi giriniz: ");
		
	    int sayi = scan.nextInt(); // bu satirdan itibaren elimizde 4 basamakli bir sayi var
	    
	    // 4 basamagi da elde etmek icin kullanilacak islemler
	    int birlerBasamagi = sayi % 10; // birler basamagini bulduk
	    
	    sayi /= 10; // birler basamagini kaldirmak icin 10'a bolduk
	    int onlarBasamagi = sayi % 10; // onlar basamagini bulduk
	    
	    sayi /= 10; // onlar basamagini kaldirmak icin 10'a bolduk
	    
	    int yuzlerBasamagi = sayi % 10; // yuzler basamagini bulduk
	    
	    sayi /=10; // yuzler basamagini kaldirmak icin 10'a bolduk
	    int binlerBasamagi = sayi % 10; // binler basamagini bulduk
	    
	    // Basamaklarini tek te yazdirmak icin:
	    System.out.println("Birler basamgi: " +birlerBasamagi);
	    System.out.println("Onlar basamgi: " +onlarBasamagi);
	    System.out.println("Yuzler basamgi: " +yuzlerBasamagi);
	    System.out.println("Binler basamgi: " +binlerBasamagi);
	    
	    // Sayiyi tersten yazdirmak icin:
	    System.out.println("Sayinin tersten yazilisi: " + birlerBasamagi + onlarBasamagi +
	    		yuzlerBasamagi + binlerBasamagi);
		
	    // sayinin rakamlari toplami:
	    System.out.println("Sayinin rakamlari toplami: " + (birlerBasamagi + onlarBasamagi +
	    		yuzlerBasamagi + binlerBasamagi));
	    
	    scan.close();
	    
	}

}
