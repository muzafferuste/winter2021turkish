package day09_ternary;

import java.util.Scanner;

public class C3_Ternary3 {

	public static void main(String[] args) {
		
		// kullanicidan 2 sayi alin buyuk olani yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 2 sayi giriniz: ");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		System.out.println(num1>num2 ? num1 : num2); 
		
		scan.close();
		
	}

}
