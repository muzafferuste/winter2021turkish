package day42_abstractClasses;

public class Isci extends Personel{

    public static void main(String[] args) {

        Isci isci1 = new Isci();

        isci1.maasHesapla(); // Iscilerin maas tutari: 5000 TL'dir.
        isci1.mesaiBilgisi(); // Isciler gunluk 8 saat calismalidir.
        isci1.isim = "Rumeysa";
        System.out.println(isci1.isim); // Rumeysa
        // System.out.println(isim);
        isci1.ozelSigorta(); // Bu personel ozel sigorta kapsamindadir

    }

    @Override
    public void maasHesapla() {

        /* parent class'da ki method'u implement(yarlama) etti
        * 1- Abstract bir class'i parent edindiysen mutlaka oradaki abstract methodu
        implement etmelisin
        * 2- parent class'daki method'da body olmadigi icin onu kullanmanin anlami yok
        biz child class'da body olan method (concrete) kullanip islem yapmaliyiz
        */

        System.out.println("Iscilerin maas tutari: 5000 TL'dir.");

    }

    @Override
    public void mesaiBilgisi() {

        System.out.println("Isciler gunluk 8 saat calismalidir.");

    }
}
