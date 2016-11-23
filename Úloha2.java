/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package úloha2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author xmelan01
 */
public class Úloha2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vypište čísla");
        
        ArrayList<Integer> seznam = new ArrayList<>();
        
        int cislo;
 
        for (int i = 0; i < 10; i = i + 1)
        {
            cislo = scanner.nextInt();
            if (cislo != 0)
            {
            seznam.add(cislo);
                }
        }  
        
        int nejmensiCislo = seznam.get(0);
        int nejvetsiCislo = seznam.get(0);
        int soucetCisel = 0;
        
        for (int v : seznam) {
            soucetCisel = soucetCisel + v;
            
            if (v > nejvetsiCislo)
            {
                nejvetsiCislo = v;
            }
            
            if (v < nejmensiCislo)
            {
                nejmensiCislo = v;
            }
        }
        
        double prumer = (soucetCisel/seznam.size());
        
        System.out.println("Největší číslo, které jsi napsal bylo: "+nejvetsiCislo+", nejmenší číslo bylo: "+nejmensiCislo+" a aritmetický průměr všech čísel je: "+prumer);
        
        ArrayList<Integer> serazenySeznam = new ArrayList<>();
        
        while (seznam.size() > 0) {
            int lNejmensiCislo = seznam.get(0);
            int index = -1;
            int indexNejmensihoCisla = 0;
            
            for (int vv : seznam) {
                index = index + 1;
                if (vv < lNejmensiCislo)
                    {
                       lNejmensiCislo = vv;
                       indexNejmensihoCisla = index;
                       }
            }
            seznam.remove(indexNejmensihoCisla);
            serazenySeznam.add(lNejmensiCislo);
        }

        for (int v : serazenySeznam) {
            System.out.println(v);
        }
    }
}

