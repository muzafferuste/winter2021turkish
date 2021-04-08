package day35_inheritance;

public class Memur extends Personel{

    public int maas;

    public Memur() {
        super();

        System.out.println("Child class parametresiz constructor calisti");
    }

    public Memur(int maas) {
        super();

        System.out.println("Child class parametreli constructor calisti");
    }

    /* Inheritance'da constructor olusturdugumuzda Java'nin otomatik olarak constructor'a
    ekledigi super(); keyword onemlidir
    * Super(); keyword default constructor gibidir. Biz gormesek de calisir, ancak
    yerine baska bir keyword yazarsak etkisiz hale gelir
     */

    public static void main(String[] args) {
        System.out.println("Main method calisti");

        Memur obj1 = new Memur(2400);

    }

}
