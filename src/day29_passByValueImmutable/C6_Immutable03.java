package day29_passByValueImmutable;

public class C6_Immutable03 {

    public static void main(String[] args) {

        // atama yapildiginda ne olur?

        String isim = "";

        for (int i = 0; i < 10; i++) {

            isim = isim + i;
            System.out.println(isim);
        }

        System.out.println("==============");
        System.out.println(isim);

        /* Java bu kod run edildiginde kac adet obje olusturur?
        11 cunku her atama isleminde tek tek variable olusturulacak
         */

    }

}
