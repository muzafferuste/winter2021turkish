package day02_scanner;

import java.util.Scanner;

public class C2_Scanner2 {
	
	public static void main(String[] args) {
		
		// Kullanicidan dairenin yaricapini isteyin ve dairenin alanini yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Alanini hesaplamak icin dairenin yaricapini giriniz: ");
		
		double yaricap = scan.nextDouble();
		
		System.out.println("Dairenin alani: " + (3.14 * yaricap * yaricap));
		
		scan.close();
		
	}

}
