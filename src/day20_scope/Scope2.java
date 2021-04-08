package day20_scope;

public class Scope2 {

	public static void main(String[] args) {
		
		Scope1 obj4 = new Scope1();
		
		System.out.println(obj4.isim); // Muzaffer
		System.out.println(obj4.soyIsim); // null
		
		obj4.isim = "Ahmet";
		obj4.soyIsim = "Can";
		
		System.out.println(obj4.isim + " " + obj4.soyIsim); // Ahmet Can
		
	}

}
