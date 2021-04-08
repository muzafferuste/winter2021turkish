package day03_scannerIncrementDecrement;

public class C5_ArtirmaAzaltma {

	public static void main(String[] args) {
		
		int num = 15;
		
		int num2 = num + 2;
		
		System.out.println("num: "+num);
		System.out.println("num2: "+num2);
		
		num = num+5; // esitligin solunda num yazdigimizda esitligin saygindaki islemde olusan sonuc 
		          // num variable'ina atanir. Bu satirdan sonra num = 20'dir. 
		System.out.println("16. Satirdan sonra num: " + num);
		
		System.out.println(num + 12);
		
		// bir sayiyi arttirmak (increment) istersek o sayiya istedigimiz sayiyi ekler ve sonucu variable'a atariz
		
		// num'i 8 arttirin.
		
		num = num + 8; // num=28
		
		// num variable'ini 5 arttirin
		
		num += 5; // num=33
		System.out.println("Java'nin pratik arttirisindan sonra: " + num );
		
		num += 10; // num=43
		
		// num variable'ini 1 arttirin
		
		// num = num +1;
		num +=1 ; // num=44
		
		// sadece 1 arttirmaya ozel olarak Java pratik method=
		num++; // num=45
		
		System.out.println("num'in son hali: " + num );
		
	}

}
