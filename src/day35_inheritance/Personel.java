package day35_inheritance;

public class Personel {

    public String isim;
    public int sayi;

    public Personel() { // parametresiz bir constructor olusturduk
        // super();

        /* Java'dan yardim alarak bir Constructor olusturdugumuzda, Java
        Constructor'in ilk satirina super(); keyword'unu ekler
        Eger icinde oldugumuz class bir child class degilse super(); keyword'u
        silinebilir. Bugune kadar bizim olusturdugumuz Constructor'larda hic
        super(); keyword'u kullanmadik. Ancak bizim class'larimiz child class
        olmadigindan hic bir sorun olmadi
         */

        System.out.println("Personel parametresiz constructor calisti.");

    }
    public Personel(String isim, int sayi) { // parametreli bir constructor olusturduk
        // super();

        System.out.println("Personel parametreli constructor calisti.");

    }

   /* Her class default Constructor'a sahiptir
    * Default Constructor parametresi YOKTUR!!
    * Biz parametreli veya parametresiz constructor olusturursak default constructer silinir
    * Eger biz sadece 1 tane parametreli constructor olusturursak, Java default olani sildigi icin
    parametresiz Constructor kalmaz
    * Dolayisiyla parametreli bir constructor olusturdugumuzda mutlaka default constructor
    yerine de parametresiz bir constructor olusturmamiz gerekir
     */

}
