package day09_ternary;

public class C1_Ternary1 {

	public static void main(String[] args) {
		
		int sayi = 101;
		
		// ternary islemi bir sonuc dondurdugu icin bir variable olusturup ona assign etmeliyiz.
		String sonuc = sayi% 2 == 0 ? "Cift sayi" : "Tek sayi";
		
		System.out.println(sonuc);
		
		// bir variable'a assign etmek istemezsem: 
		System.out.println((sayi% 2) == 0 ? "Cift sayi" : "Tek sayi");
		
		// basina aciklama yazmak istersem: 
		// ternary operatorunu parantez icine almaliyiz.
		System.out.println("islem sonucu: " + ((sayi% 2) == 0 ? "Cift sayi" : "Tek sayi"));
		
		
		
	}

}
