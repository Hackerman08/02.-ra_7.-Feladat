
package feladat_7;

import java.util.Scanner;


public class Feladat_7 {

    public static void main(String[] args) { 
        int szam;
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Kérem adja meg a hónapot számmal: ");
       
        szam= input.nextInt();
        if(szam<=2){
            System.out.println("Tél");
        }else if(szam<=3 || szam <=5){
            System.out.println("Tavasz");
        }else if(szam<=6 || szam <=8){
            System.out.println("Nyár");
        }else if(szam<=9 || szam<=11){
            System.out.println("Ősz");
        }else if(szam==12){
            System.out.println("Tél");
        }
    }
    
}
