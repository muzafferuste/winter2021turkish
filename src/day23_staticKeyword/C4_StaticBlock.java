package day23_staticKeyword;

public class C4_StaticBlock {
	
	static String isim;
	
	/*
	 * Static block Class calistirildiginda ilk olarak calisir. (mainMehod'dan da once calisir)
	 * Static block'lar static variable'lara deger atamak icin kullanilir.
	 */
	
	static {
		
		isim = "Mehmet";
		System.out.println(isim);
	}
	
	static {
		
		System.out.println("2.static block calisti!");
	}

	public static void main(String[] args) {
		
		isim = "Alican";
		System.out.println(isim);
		
	}

}
