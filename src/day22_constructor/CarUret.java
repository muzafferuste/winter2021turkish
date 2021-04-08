package day22_constructor;

public class CarUret {
	
	/* Soru: CONSTRUCTER BU CLASS'DA NEREDEDIR?
	 * Su anda bu class'da gorunur bir constructor yok
	 * bir class olusturuldugunda Java bu class'dan obje uretilecegini bilir
	 * ve gorunmeyen DEFAULT CONSTRUCTER'i class'a yerlestirir
	 * Default Constructer parametresizdir dolayisiyla sadece hic bir ozelligi teanimlanamayan
	 * objeler uretir (Tshirt uret demek gibidir)
	 * Default Constructor ile uretilen bir objenin tum ozellikleri sonradan tanimlanmalidir
	 * 
	 * egerbiz sonradan bir constructor olusturursak, Java default constructer'i iptal eder
	 */
	
	// Bir Constructer olusturalim: 
	public CarUret() {
		
	}
	
	/* KURALLAR
	 * 1- Ismi class ile ayni olmalidir.(Dolayisiyla buyuk harfle baslar)
	 * 2- Constructer return type'a sahip degildir.
	 * 3- Constructer isminden sonra mutlaka parantez olur () ama parametre olmasi opsiyoneldir
	 * 4- Bir constructer olusturuldugunda kimlerin kullanacagini belirlemek icin Access Modifer yazilir
	 */
	
	String marka;
	String model;
	int yil;
	boolean kazaDurum;
	
	/*
	* Bir programda cok fazla uretecegimiz objeler icin bir tane class olustururuz.
	* Bu class'da olusturulacak objelere ait tum ozellikler olur.
	* Bu class direkt calistirilmayacagi icin mainMethod olmasa da olur
	* (Kaliphane gibidir)
	*/
	
	public void yakit(String yakit) {
		
		System.out.println("Araba yakit olarak " + yakit + " kullanir.");
	}
	
	public void vites(String vites) {
		
		System.out.println("Araba " + vites + " vitesdir.");
	}

}
