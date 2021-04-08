package day14_methodCreation;

public class C4_MethodCreation4 {

	public static void main(String[] args) {
		
		toplama(60.2, 50);
		toplama(50, 60);
		toplama(25.5, 26.5);
		toplama('m', 'u');
		toplama("Muzaffer ", "Uste");
		
	}

	public static void toplama(int sayi1, int sayi2) {

		System.out.println("Integer method sonucu: " + (sayi1 + sayi2));

	}

	public static void toplama(double sayi1, double sayi2) {

		System.out.println("Double method sonucu: " + (sayi1 + sayi2));

	}
	
	public static void toplama(int sayi1, double sayi2) {

		System.out.println("Int/Double method sonucu: " + (sayi1 + sayi2));

	}
	
	public static void toplama(char char1, char char2) {

		System.out.println("Char method sonucu: " + char1 + char2);

	}
	
	public static void toplama(String str1, String str2) {

		System.out.println("String method sonucu: " + (str1 + str2));

	}

}
