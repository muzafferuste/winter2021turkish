package day05_wrapperConcetanationOperators;

public class C3_Concatenation {

	public static void main(String[] args) {
		
		// Concatenation (Birlestirme): Java'nin birden fazla String'i + isareti ile toplarsaniz,
		// Java bu Stringleri yanyana yazar
		
		String str1 = "Java";
		String str2 = "Guzeldir";
		String bosluk = " ";
		
		System.out.println(str1 + str2); // JavaGuzeldir
		
		// Eger arada bosluk birakmak isterseniz:
		System.out.println(str1 + " " + str2); // Java Guzeldir
		System.out.println(str1 + ' ' + str2); // Java Guzeldir
		System.out.println(str1 + bosluk + str2); // Guzeldir Java
		
		// GuzeldirJava yazdirmak icin:
		System.out.println(str2 + str1);
		
		// Guzeldir Java yazdirmak icin:
		System.out.println(str2 + " " + str1); // Guzeldir Java
		System.out.println(str2 + ' ' + str1); // Guzeldir Java
		System.out.println(str2 + bosluk + str1); // Guzeldir Java
		
		int sayi1 = 5;
		int sayi2 = 4;
		
		// verilen degiskenleri kullanarak Console'da 9 yazdirin:
		System.out.println(sayi1 + sayi2);
		// verilen degiskenleri kullanarak Console'da 54 yazdirin:
		System.out.println("" + sayi1 + sayi2);
		
		System.out.println(sayi1 + sayi2 + str1 + str2); // 9JavaGuzeldir
		
		System.out.println(str1 + str2 + sayi1 + sayi2); // JavaGuzeldir54
		
		System.out.println(str1 + str2 + (sayi1 - sayi2)); // JavaGuzeldir1
		
		System.out.println((sayi1 + sayi2) + " " + str1 + str2); // 9 JavaGuzeldir
		
		// Java, matematiksel islem yaparken char data type'dan bir degerle karsilasirsa o char'in ASCII degerini alir
		System.out.println((sayi1 + sayi2) + ' ' + str1 + str2); // 9 + 52(ASCII TABLE) + st1 + str2 ==> 41JavaGuzeldir
		
		System.out.println(sayi1 + sayi2 + str1 + ' ' + str2); // 9Java Guzeldir
		
		System.out.println(str1 + str2 + sayi1 * sayi2); // JavaGuzeldir20
		
		// son tekrar
        /* kural1) Eger toplanan degerlerden bir tanesi bile String ise Java toplama degil 
         concatenation(Birlestirme)
         * kural2) Eger toplanan degerlerin ikisi de matematiksel islemse Java toplar
         * kural3) Eger sayi ve String degiskenler birlikte kullanilacaksa oncelikler
         belirlenip o islemler icin parantez kullanilabilir
         * kural4) Matematiksel bir islemde char degisken kullanilirsa, Java char'in ascii degerini
         isleme alir
         * kural5) char bir degisken ile String bir degisken toplanirsa concatenation olur
         */
		
	}

}
