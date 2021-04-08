package day20_scope;

import java.util.Scanner;

public class Scope1 {

	public String soyisim;
	public int sayi; // default deger 0 (Sifir)
				// Class'in icinde fakat mainMethod disinda olusturulan ve static olmayan
				// variable'lara INSTANCE (Object) variable denir.
				// Class level'da olusturuldugu icin class'in her yerinden belli sartlarla
				// kullanilabilir.

	public String isim = "Muzaffer";
	public String soyIsim; // default deger null
	boolean izindeMi; // default deger false
	char ilkHarf; // default deger " " (space)

	public static void main(String[] args) {

		// System.out.println(sayi); // Static olmayan bir variable'a static method
									// icinden ulasamayiz!! Main
		// method(); 				// method'umuz static oldugu icin mainMethod icerisinden static
									// olmayan variable veya metho'lara direkt ulasamayiz

		// Instance bir variable'a main method icerisinden ulasmak istedigimizde;
		// OBJECT olusturmaliyiz

		Scanner scan = new Scanner(System.in); // bu java'daki standart obje olusturma formudur.
		
		Scope1 obj1 = new Scope1();
		
		System.out.println(obj1.sayi);
		System.out.println(obj1.isim);
		// instance variable'lar olusturuldugunda biz istersek deger atayabiliriz
		// Instance variable'lara Eger biz deger atamazsak Java default deger atar
		
		Scope1 obj2 = new Scope1();
		obj2.isim = "Muslum";
		obj2.soyIsim = "Baba";
		
		System.out.println(obj2.isim + " " + obj2.soyIsim); // Muslum Baba
		System.out.println(obj1.isim + " " + obj1.soyIsim); // Muzaffer null
		
		System.out.println(obj2.izindeMi); // false
		System.out.println(obj2.ilkHarf); // " " (space)
		
		Scope1 obj3 = new Scope1();
		obj3.isim = "Ferdi";
		obj3.soyIsim = "Tayfur";
		obj3.izindeMi = true;
		
		System.out.println(obj3.isim + " " +  obj3.soyIsim + " " + obj3.izindeMi); // Ferdi Tayfur True		
		
		scan.close();

	}

	public static void staticMethod() {

	}

	public void method() {
		
		System.out.println(sayi); // bu method static olmadigi icin instance variable'lara direkt erisebilir

	}

}
