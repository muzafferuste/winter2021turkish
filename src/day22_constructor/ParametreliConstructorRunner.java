package day22_constructor;

public class ParametreliConstructorRunner {

	public static void main(String[] args) {
		
		ParametreliConstructor oto1 = new ParametreliConstructor();
		System.out.println("Otomobil1: " + oto1.marka + " " + oto1.model + " " + oto1.yil + " " + oto1.kazaDurum);
		// default degerleri yazdirir (null null 0 false)
		
		ParametreliConstructor oto2 = new ParametreliConstructor(2015);
		System.out.println("Otomobil2: " + oto2.marka + " " + oto2.model + " " + oto2.yil + " " + oto2.kazaDurum);
		// null null 2015 false
		
		ParametreliConstructor oto3 = new ParametreliConstructor("Toyota", "Corolla", 2010, true);
		System.out.println("Otomobil3: " + oto3.marka + " " + oto3.model + " " + oto3.yil + " " + oto3.kazaDurum);
		// Toyota Corolla 2010 true
		
	}

}
