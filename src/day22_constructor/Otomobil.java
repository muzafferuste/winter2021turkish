package day22_constructor;

public class Otomobil {

	public Otomobil(String renk) { // Istersek Constructer'i parametreli olarak olusturabiliriz

	}

	// Biz bir Constructor olusturdugumuzda Java default olani iptal eder.
	// Dolayisila biz bir constructer olusturdugumuzda mutlaka default
	// constructer'in yerine de bir constructer yazmaliyiz
	
	public Otomobil() { // Default constructor'in yerine bunu yazmaliyiz.

	}
	
	// ***ONEMLI NOT*** Default Constructor'dan baska bir constructor olusturdugumuzda
	// Java default olani yok ettigi icin MUTLAKA biz default erine de Constructor yazmaliyiz

	String marka;
	String model;
	int yil;
	boolean kazaDurum;

	public void yakit(String yakit) {

		System.out.println("Araba yakit olarak " + yakit + " kullanir.");
	}

	public void vites(String vites) {

		System.out.println("Araba " + vites + " vitesdir.");
	}

}