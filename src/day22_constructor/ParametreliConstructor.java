package day22_constructor;

public class ParametreliConstructor {
	
	String marka;
	String model;
	int yil;
	boolean kazaDurum;
	
	public ParametreliConstructor() { // 1

	}

	public ParametreliConstructor(int yil) { // 2
		
		this.yil = yil;
		
	}

	public ParametreliConstructor(String marka, String model) { // 3
		
		this.marka = marka;
		this.model = model;

	}

	public ParametreliConstructor(String marka, String model, int yil, boolean kazaDurum) { // 4
		
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.kazaDurum = kazaDurum;

	}

	public void yakit(String yakit) {

		System.out.println("Araba yakit olarak " + yakit + " kullanir.");
	}

	public void vites(String vites) {

		System.out.println("Araba " + vites + " vitesdir.");
	}

}
