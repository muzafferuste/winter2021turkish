package day42_abstractClasses;

public class IdariPersonel extends Personel{

    /* "extends Personel" yazarak Abstract Personele concrete bir
    child olusturdum ve Java CTE verdi
    * Cozum olarak urettigi 2 ihtimal var
    1- Unimplemented(uyarlanmamis) method'lari uyarla
    2- ya da Personel class'indan abstract kelimesini kaldir
    * Bu class'in calisabilmesi icin 2 islemden birini yapmak zprundayiz
    */

    public static void main(String[] args) {

    }

    /* Concrete bir class'da abstract bir method olusturulamaz.
    * public abstract void surekliCalisma();
     */

    @Override
    public void maasHesapla() {

        System.out.println("Idari personel maasi 4000 TL'dir.");

    }

    @Override
    public void mesaiBilgisi() { }

}
