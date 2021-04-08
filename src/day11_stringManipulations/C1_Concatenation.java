package day11_stringManipulations;

public class C1_Concatenation {

	public static void main(String[] args) {
		
		// concatenation: Java'da + islemi yapilirken eger toplanan ifadelerden biri veya
		// her ikisi String ise Java toplama degil BIrlestirme yapar
		
		System.out.println(15 + 20 + "Merhaba"); // 35Merhaba
		System.out.println("Merhaba" + 15 + 20); // Merhaba1520
		System.out.println("Merhaba" + (15 + 20)); // Merhaba35
		System.out.println("Merhaba" + 15 * 20); // Merhaba300
		
		String str1 = "Hello";
		String str2 = "World";
		
		System.out.println(str1 + " " + str2); // Hello World
		System.out.println(str1.concat(str2)); // HelloWorld
		System.out.println(str1.concat(" ").concat(str2)); // Hello World
		System.out.println(str1.concat(" " + str2)); // Hello World
		
	}

}
