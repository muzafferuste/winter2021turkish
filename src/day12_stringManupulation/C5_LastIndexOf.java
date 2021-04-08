package day12_stringManupulation;

import java.util.Scanner;

public class C5_LastIndexOf {

	public static void main(String[] args) {
		
		// kullanicidan bir cumle alin
		// asagidaki uc durumdan uygun olani yazdirin
		// 1- cumle java icermiyor
		// 2- cumle bir tane java iceriyor
		// 3- cumle biden fazla java iceriyor
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz: ");
		
		String cumle = scan.nextLine().toLowerCase();
		
		int ilkJava = cumle.indexOf("java");
		int sonJava = cumle.lastIndexOf("java");
		
		if (ilkJava==-1) {
			
			System.out.println("Cumle Java icermiyor!");
			
		} 
		
		else if (ilkJava==sonJava) {
			
			System.out.println("Cumle bir tane java iceriyor.");
		} 
		
		else {
			
			System.out.println("Cumle birden fazla Java iceriyor.");
		}
		
		scan.close();
		
	}

}
