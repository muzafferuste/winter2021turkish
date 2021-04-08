package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exceptions02 {

    @SuppressWarnings({"unused", "resource"})
    public static void main(String[] args) throws FileNotFoundException, IOException {

            FileInputStream fis = new FileInputStream("C:\\Users\\ustem\\eclipse-workspace" +
                    "\\winter2021turkish\\src\\day39_exceptions\\file");

            // try-catch blogu exception ile handle etmekte kullanilir
            // throws keyword'u ise sadece declaration
            // throws kullanilan bir method'da exception olusursa KOD BLOKE OLUR

        int k = 0;

        while ((k = fis.read()) != -1) {

            System.out.print((char) k);

        }

        System.out.println();
        System.out.println("Kod bloke olmamis");

    }

}
