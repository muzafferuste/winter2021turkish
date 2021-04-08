package day04_matematikselIslemlerModulus;

public class C1_MatematikselIslemler {

	public static void main(String[] args) {
		
		int num1 = 38 / 2 * ( 4 + 3 ) * 2;
		System.out.println(num1);
		
		int num2 = 8 + 2 * ( 14 - 6 / 2 ) - 12;
		System.out.println(num2);
		
		int num3 = 10;
		
		double num4 = (double)num1 * num2 / num3; // 266 * 18 / 10 = 478.8 ==> 478
		/* Java once sitligin sag tarafini yapar
		 * Bu ornekte sag taraftaki tum degiskenler int oldugundan sonucu da int yapar
		 sonra assignment (atama) islemi yapilir.
		 */
		System.out.println(num4);
		
		double num5 = 24.56;
		double num6 = 14.2;
		
		double num7 = num5 / num6;
		System.out.println(num7); // 1.7295774647887323
		
		System.out.println(num5 / num3); // 24.56 / 10 = 2.456
		
		
	}

}
