package day37_overriding;

public class GeciciIsci extends Isci{

    public String calistigiBolum = "Yemekhane";

    public static void main(String[] args) {

        // Overriding
        // bir child class'da parent class'dan miras alinan method'u
        // degistirmeye overriding denir

        GeciciIsci gi1 = new GeciciIsci();
        System.out.println(gi1.maasHesapla());
        gi1.mesai();

    }

    @Override
    public int maasHesapla() {
        // 2400
        return 30 * 8 * 10;
    }

    @Override
    public final void mesai() {

        super.mesai();
        System.out.println("Gecici isciler haftada 25 saat calisir.");

    }

    /* annoation: aciklama, dipnot
    Java 25.satirda kodu inceleyenler icin aciklama getiriyor
    * Annocation sadece bir aciklama degildir, override yaptigimiz methodu surekli
    kontrol eder ve parent class'da ki overridden method signature'i degistirilirse
    CTE verir.
    * Eger override edilen parent class'daki method(overriden)'un da
    calismasini istiyorsak overriding methodunun super.overriddenMethodIsmi() yazariz
    Eger overriding method'un super.overriddenMethodIsmi() yazilmazsa
    overridden method calismaz (constructor'dan farkli)
    */

    /* Access Modifier
    Child Parent'i sinirlandirimaz
    Yani overriding method'un access modifier'i overridden method'un access
    modifier'indan daha dar olamaz
     */

    /* Return Type
    Overridden method'un return type'i primitive veya void ise
    overriding method'un return type'i da ayni olmali
    * Eger return type primitive degilse
    (overriding method'un return type'i) Is-A (overridden method'un return type'i) olmalidir
     */

}
