package day43_interfaces;

public interface Interface02 {

    // Soru: buradaki default ve static bizim bildigimiz default ve static mi?
    // Cevap: HAYIR

    public default void deneme() {

        System.out.println("default keyword'lu method calisti");

    };

    /* bizim bildigimiz default access modifier'di
    * bir method'da birden fazla access modifier olur mu?
    * Bizim interface'de olusturdugumuz tum method'lar public'tir.
    * Interface'de default keyword kullanarak concrete method olusturabiliriz
    * Buradaki default keywird'u access modifier degil, Java'nin
    ozel bir cozumudur
    * Buradaki default keyword basina yazildigi method'un concrete oldugunu belirtir
    */

    static void deneme2() {

        System.out.println("static keyword'lu method calisti");

    }

    // Buradaki static keyword basina yazildigi method'un concrete oldugunu belirtir
    // Default icin yazdigimiz her sey static icin de gecerlidir !!!

    // Static ve default keyword'u kullanarak olusturdugumuz methodlar
    // overrride edilmek ZORUNDA DEGILDIR !!!!! (Cunku concrete'dir)

}
