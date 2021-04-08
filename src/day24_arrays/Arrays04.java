package day24_arrays;

import java.util.Arrays;

import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kac sayidan olusan bir array istediginizi giriniz: ");
		
		int uzunluk = scan.nextInt();
		
		// Kullanicidan degerler alarak int bir array olusturun
		
		int arr[] = new int[uzunluk];
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("Lutfen Array'e eklemek icin " + uzunluk + " sayi giriniz: ");
			arr[i] = scan.nextInt();
			
			uzunluk--;
		}
		
		System.out.println(Arrays.toString(arr));
		
		scan.close();
		
	}

}
