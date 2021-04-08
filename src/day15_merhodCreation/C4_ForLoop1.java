package day15_merhodCreation;

public class C4_ForLoop1 {

	public static void main(String[] args) {
		
		// 5 defa "Hello World" yazdiralim
		
		/*
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		*/
		
		// bunun yerine loop kullaniyoruz
		// ne yapacagimizi Java'ya soyluyoruz, kac kere yapmasi gerektigini de soyluyoruz
		
		// Tum loop'larda 3 seyi yazmak zorundayiz
		// 1) baslangic degeri
		// 2) bitis degeri
		// 3) artis degeri
		
		for (int i = 100; i > 3; i-=1) {
			
			System.out.println(i + ". Hello World!");
			
		}
		
		// NOT: Eger sart kismi bizim artisimiza gore hep true verirse loop sonsuz donguye girer
		// NOT: Loop'da artis degeri pozitif(i++) oldugu gibi negatif(i--) de olabilir 
		// NOT: Artis degeri 1 olmak zorunda degil, farkli da olabilir (ornek: i+=5)
		// NOT: Eger loop'un sarti hic true olmazsa loop body hic devreye girmez
		
	}

}
