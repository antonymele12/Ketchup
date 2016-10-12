/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package úloha1;

import java.util.Scanner;

/**
 *
 * @author xmelan01
 */
public class Úloha1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Zadej jméno: ");
        String jmeno = sc.nextLine();
        
        System.out.print("Zadej věk: ");
        String vek = sc.nextLine();
        
        sc = new Scanner(System.in);
        System.out.print("Zadej hmotnost: ");
        double hmotnost = sc.nextDouble();
        
        sc = new Scanner(System.in);
        System.out.print("Zadej výšku v centimetrech: ");
        double vyska = sc.nextDouble();
        
        sc = new Scanner(System.in);
        System.out.print("Zadej oblíbenou barvu: ");
        String barva = sc.nextLine();
        
        double BMI = (hmotnost/(vyska/100*vyska/100));
        
        String BMIkom = "CHYBA";
        
        if (BMI < 20)
        {
            BMIkom = "podváhu";
        }
        else if (BMI < 25)
        {
            BMIkom = "ideální váhu";
        }
        else if (BMI < 30)
        {
            BMIkom = "nadváhu";
        }
        else if (BMI < 40)
        {
            BMIkom = "obezitu";
        }
         else if (BMI > 40)
        {
            BMIkom = "těžkou obezitu";
        }
        
        System.out.println("Člověku jménem "+jmeno+" je "+vek+" let, važí "+hmotnost+", měří "+vyska+", jeho oblíbená barva je "+barva+" a jeho BMI je "+BMI+", což znamená že má "+BMIkom+".");
        
    }
    
}
