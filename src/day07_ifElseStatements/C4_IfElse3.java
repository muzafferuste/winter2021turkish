package day07_ifElseStatements;

import java.util.Scanner;

public class C4_IfElse3 {
	
	public static void main(String[] args) {
        
		// kullanicidan yasini sorun
        // yas 65 veya buyukse "emekli olabilirsin" yoksa "emekli olamazsin" yazdirin
        
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz: ");
        
        int yas = scan.nextInt();
        
        if (yas >= 65) {
           
        	System.out.println("Emekli Olabilirsiniz.");
        	
        } else {
            
        	System.out.println("Emekli olamazsiniz.");
        	
        }
        scan.close();
    }

}
