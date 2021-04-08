package day34_inheritance;

public class Isci extends Muhasebe {

    public static void main(String[] args) {

        Isci isci1 = new Isci();

        /* Bu derse kadar hangi class'dan bilgi elde etmek istiyorsak o class'dan obje olusturduk
        INheritance ile bu mecburiyet ortadan kalkti
        Child class'da olusturdugum obje ile tum parent class'larda
        bulunan variable ve method'lari inherit edebilirim
         */

        isci1.isim = "Omer";
        isci1.soyIsim = "Aydin";
        isci1.id = 1001;
        isci1.izindeMi = false;
        isci1.saatUcret = 10;
        isci1.statu = "Isci";
        isci1.maas = isci1.maasHesapla();

        System.out.println(isci1.id + " " + isci1.isim + " " + isci1.soyIsim
                + " " + isci1.statu + " " + isci1.maas + "TL");

        Isci isci2 = new Isci();
        isci2.isim = "Esad";
        isci2.soyIsim = "Okumus";
        isci2.id = 1002;
        isci2.izindeMi = false;
        isci2.saatUcret = 10;
        isci2.statu = "Isci";
        isci2.maas = isci1.maasHesapla();

        System.out.println(isci2.id + " " + isci2.isim + " " + isci2.soyIsim
                + " " + isci2.statu + " " + isci2.maas + "TL");

    }

}
