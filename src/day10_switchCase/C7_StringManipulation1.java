package day10_switchCase;

public class C7_StringManipulation1 {

	public static void main(String[] args) {
		
		// String non-primitive data turundendir bu yuzden value ile birlikte methodlara sahiptir
		// methodlari kullanarak String'i degistirmeye StringManipulation denir.
		
		String str1 = "Hello World";
		
		System.out.println(str1.toUpperCase()); // HELLO WORLD
		
		System.out.println(str1); // Hello World
		
		String str2 = str1.toUpperCase();
		
		System.out.println(str1); // Hello World
		
		System.out.println(str2); // HELLO WORLD
		
	}

}
