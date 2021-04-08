package day03_scannerIncrementDecrement;

public class C4_DataCastingDaralma {

	public static void main(String[] args) {
		
		// double bir degisken olustularim ve bunu int ve sonra da byte'a cevirin
		
		double numDouble = 129.56;
		
		int numInt = (int) numDouble;
		// double'dan integer'a gecerken eger sayida ondalikli bolum varsa
		// java ondalikli bolumu sile (yok sayar)
		
		System.out.println("Integer degisken degeri: " + numInt);
		
		byte numByte = (byte)numInt;
		// daha dar (narrow) bir data type'a cevirirken, eger data type'in sinirindan buyukse
		// saymaya negatif en kucuk sayidan devam eder
		// istenen sayiya gelinceye kadar tekrar tekrar en kucuk negatif sayiya gider
		
		System.out.println("Byte degisken degeri: " + numByte);
	}

}
