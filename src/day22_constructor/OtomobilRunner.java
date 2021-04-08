package day22_constructor;

public class OtomobilRunner {

	public static void main(String[] args) {

		// Otomobil oto1 = new Otomobil(); ==> Default Constructer kullandik

		Otomobil oto1 = new Otomobil();
		oto1.vites("Otomatik");
		
		Otomobil oto2 = new Otomobil("Kirmizi");
		oto2.vites("Duz");

	}

}