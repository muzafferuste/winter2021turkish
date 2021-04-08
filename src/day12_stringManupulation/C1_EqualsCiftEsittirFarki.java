package day12_stringManupulation;

public class C1_EqualsCiftEsittirFarki {

	public static void main(String[] args) {
		
		String str1 = "Ali Can";
		String str2 = str1 + ""; // Ali Can 
		
		System.out.println(str1 == str2); // false
		
		// == Stringlerin hem degerlerine hem de adreslerine bakar
		// bu ornekte str1 + "" yazdigimizda concatenation yapildigi icin java yeni bir obje olusturur
		// ve islemin sonucunu yeni obje'nin icine koyar
		// str1 ve str2'yi == ile karsilastirirsak degerleri AYNI fakat adresleri FARKLI oldugu icin false doner
		
		System.out.println(str1.equals(str2)); // true
		
		// equals() methodu sadece String'lerin degerlerini karsilastirir
		// bu ornekte str1 ile str2'nin degerleri AYNI oldugu icin true doner
		
		String str3 = "Ali Can";
		System.out.println(str1 == str3); // true
		System.out.println(str1.equals(str3)); // true
		
	}

}
