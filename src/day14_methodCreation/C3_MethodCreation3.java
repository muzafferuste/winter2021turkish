package day14_methodCreation;

public class C3_MethodCreation3 {

	public static void main(String[] args) {

		// verilen 3 double sayinin ortalamasini alan bir method yazin
		// main method icinden cagirarak methodu calistirin

		ortalama(25, 27);
		ortalama(20, 25, 30);

	} // MainMethod sonu

	public static void ortalama(double sayi1, double sayi2, double sayi3) {

		System.out.println("Girilen 3 sayinin ortalamasi: " + ((sayi1 + sayi2 + sayi3) / 3));

	} // 3 double sayili ortalama methodu sonu

	public static void ortalama(double sayi1, double sayi2) {

		System.out.println("Girdiginiz iki sayinin ortalamsi: " + ((sayi1 + sayi2) / 2));

	} // 2 double sayili ortalama methodu sonu

} // Class sonu
