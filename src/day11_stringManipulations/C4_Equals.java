package day11_stringManipulations;

public class C4_Equals {

	public static void main(String[] args) {
		
		// str1.equals(str2) str1 ve str2'yi karsilastirir 
		// Stringlerin birbirine esit olup olmadigini kontrol eder
		// sonuc olarak true veya false döndürür
		
		// bazi methodlar yaptiklari islem ile döndürdükleri sonuc farkli olabilir
		// bir methoda git ali ismindeki elementi sil deriz.
		// o da gidip ali'yi bulur ve siler
		// 
		
		String str1 = "Ali Can";
		String str2 = "Ali Can";
		
		System.out.println(str1.equals(str2)); // true
		
		System.out.println(str1.equals(str2) ? "Esit" : "Esit degil");
		
		// Java'da String'ler buyuk-kucuk harf duyarlidir
		// Bir harf bile farkli olsa String'ler esit olmaz
		
	}

}
