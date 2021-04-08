package day14_methodCreation;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
		
		String str = "Java cok guzel";
		
		// 1) Jave methodlarin sadece ismine degil, isim + parametre'lere bakar
		// Sadece parametre sayisi degil parametre'lerin data type'larina da bakar
		
		str.endsWith("el"); // bu method'un gorevi gidip String'in son kismini kontrol etmek
		                    // bu method'u kullanmak icin method'un kontrol ettikten sonra
		                    // bana rapor olarak ne getirecegini bilmem gerekir (true / false)
		
		// 2) bir method olusturdugumuzda method'un ne yapacagina
		// ve bu gorevi yaptiktan sonra bana ne dondurecegine bastan karar vermeliyiz
		
		// 3) Bir mmethod olusturulurken " str.indexOf(String str, int fromIndex) " de oldugu gibi
		// disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini deklare etmeliyiz
		
		// Method'u calistirmak istedigimizde (Method'u cagirmak) Parametre olarak declare edilen
		// data type'larina uygun degerler girmeliyix. Girilen bu degerlere ARGUMENT denir.
		
		str.indexOf("va", 1);
		
	}

}
