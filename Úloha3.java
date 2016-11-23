/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package úloha3;

import java.util.Scanner;

/**
 *
 * @author xmelan01
 */
public class Úloha3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kolik může být vaše číslo nejméně?");
        int nejmensiMozne = scanner.nextInt();
        
        System.out.println("Kolik může být vaše číslo nejvíce?");
        int nejvetsiMozne = scanner.nextInt();
        
        String odpoved = "";
        int posledniTip = nejvetsiMozne;
       
        while (!"To je ono".equals(odpoved)) {
            
            int tip = nejmensiMozne + (nejvetsiMozne - nejmensiMozne)/2;
            System.out.println("Je "+tip+" vaše číslo, nebo je větší/menší?");
            odpoved = scanner.nextLine();
            scanner = new Scanner(System.in);

                if ("Vetsi".equals(odpoved)) {
                    nejmensiMozne = tip;
                }
                else if ("Mensi".equals(odpoved)) {
                    nejvetsiMozne = tip;
                }
                else if ("To je ono".equals(odpoved)) {
                    nejvetsiMozne = tip;
                }
                else {
                    System.out.println("Odpovídejte pouze 'Mensi'/'Vetsi'/'To je ono'");
                }
        }
        System.out.println("Hurá!");
    }
    
}
