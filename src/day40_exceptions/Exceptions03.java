package day40_exceptions;

public class Exceptions03 {

    public static void main(String[] args) {

        /* finally blogu exception olsa da olmasa da calisacak kisimdir.
        Exception throw etse bile finally blogu yine de calisir
        Hata olmasa da calisacaktir.
         */

        int arr[] = {1, 4, 7, 8};

        try {

            System.out.println(arr[20]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(e.getMessage());

        } finally {

            System.out.println("Ne olursa olsun bu satir yazilsin");

        }

        /* finally blogu try-catch bolugu ile veya sadece try ile calisabilir
        Finally blogu catch ile on gordugum bir sorun oldugunda calistigi gibi
        on goremedigim bir sorun oldugunda da calisir
         */

        System.out.println("Kod bloke olmamis.");

    }

}
