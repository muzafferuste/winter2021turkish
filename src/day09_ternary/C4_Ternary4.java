package day09_ternary;

import java.util.Scanner;

public class C4_Ternary4 {

	public static void main(String[] args) {
		
		// Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz: ");
		
		int num1 = scan.nextInt();
		
		System.out.println(num1%2 == 0 ? "Cift sayidir" : "Tek sayidir");
		
		scan.close();
		
		// girilen sayinin mutlak degerini yazdiriniz
		
		System.out.println(num1<0 ? num1 * -1 : num1);
		
		
		
	}

}
