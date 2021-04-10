package day49_maps;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Maps04_VeriTabani {

    public static void main(String[] args) {

        String dosyaYolu = "C:\\Users\\ustem\\Desktop\\VeriTabani.csv";

        Map<String, String> veriMap = veriTabaniAl(dosyaYolu);

        System.out.println(veriMap);
    }

    public static Map<String, String> veriTabaniAl(String dosyaYolu) {

        Map<String, String> eklenecekMap = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(dosyaYolu));

            String satir = " ";
            satir = br.readLine();

            while (satir != null) {

                String keyValue[] = satir.split(",");
                eklenecekMap.put(keyValue[0], keyValue[1]);
                satir = br.readLine();
            }

        } catch (FileNotFoundException e) {

            System.out.println("Dosya bulunamadi!");

        } catch (IOException e) {

            System.out.println("Dosya okunamadi!");
        }

        return eklenecekMap;
    }

}