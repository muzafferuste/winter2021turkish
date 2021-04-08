package day02_scanner;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
		// Scanner ile kullanicidan bilgi alabiliriz
		// 3 adimla Scanner islemini gerceklestirebiliriz
		
		// 1. adim: Scanner olusturacagiz
		Scanner scan = new Scanner(System.in);
		
		/* new: Java da ne zaman new kelimesini gorseniz yeni bir obje olusturuluyor demektir
		 * parantez icine yazilan degerler parametre diyoruz ve Scanner icin System.in yazmamiz gerekir
		 * bir kod yazdigimiz zaman altinda kirmizi cizgi oluyorsa veya satir numarasi olan kisimda kirmizi
		 bir ampul veya x isareti varsa bir seyler yanlis demektir
		 * java.util Java'nin bizim icin hazirladigi bir kutuphanedir, ihtiyacimiz oldugunda ihtiyacimiz 
		 olan kodlari class'a import etmeniz yeterlidir
		 * scan: olusturudugumuz Scanner objesine verdigimiz isimdir, farkli isimler de verebiliriz
		 ama scan ismi tum programcilar tarafindan kullanilan bir isimdir
		 * kodlarimizin anlasilabilir ve rahat okunabilir olmasi icin scan ismini kullanmamiz tavsiye edilir
		*/
		
		// 2. adim: Kullaniciya bir mesaj verin
		System.out.println("Karenin bir kenar uzunlugunu giriniz: ");
		
		/* 3. adim: kullanicinin console'a girdigi degeri programimiza alacagiz
		ve bir variable olusturup bu degeri atayacahiz
		*/
		/* kullanicidan bir kenar uzunlugu istedigimiz icin kullanici kucuk bir sayi da girebilir
		buyuk bir sayi dagirebilir tam sayida yazabilir ondalikli sayi da yazabilir.
		*/
		double kenar = scan.nextDouble();
		
		System.out.println("Girdiginiz kenar uzunluguna sahip kare'nin alani: "+kenar*kenar);
		// 5.2 * 5.2 = 27.04
		
		scan.close();
		
		
	}

}
