package day08_ifElseIfNestedIf;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {

		/*
		 * Kullanicidan gun ismini yazmasini isteyin Girilen isim gecerli bir gun ise
		 * isminin 1., 2., 3., harflerini ilk harf buyuk diger ikisi kucuk olarak
		 * yazdirin gun ismi gecerli degilse "Gecerli gun ismi giriniz" yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir gun ismi giriniz: ");

		String gun = scan.nextLine();

		if (gun.equalsIgnoreCase("pazartesi") || gun.equalsIgnoreCase("pazar")) {

			System.out.println("Paz");

		}

		else if (gun.equalsIgnoreCase("sali")) {

			System.out.println("Sal");

		}

		else if (gun.equalsIgnoreCase("carsamba")) {

			System.out.println("Car");

		}

		else if (gun.equalsIgnoreCase("persembe")) {

			System.out.println("Per");

		}

		else if (gun.equalsIgnoreCase("cuma") || gun.equalsIgnoreCase("cumartesi")) {

			System.out.println("Cum");

		}

		else {

			System.out.println("Lutfen gecerli bir gun ismi giriniz!");

		}

		scan.close();

	}

}
