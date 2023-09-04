package org.exercices.all;

import java.io.IOException;
import java.util.Scanner;


/**
 * CobaiasExperiences responsável por
 *
 * @author lucas
 * @since 2023-09-04
 */
public class CobaiasExperiences {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int quantEntry = sc.nextInt();

        int c = 0;
        int r = 0;
        int s = 0;
        sc.nextLine();

        for(int i=0;i<quantEntry;i++){
            String entry = sc.nextLine();

            if(entry.endsWith("C")) {
                c += mapStringNumTypeToInt(entry);
            }
            if(entry.endsWith("R")) {
                r += mapStringNumTypeToInt(entry);
            }
            if(entry.endsWith("S")){
                s += mapStringNumTypeToInt(entry);
            }
        }
        int total = c+r+s;
        System.out.println(String.format("Total: %d cobaias", total));
        System.out.println(String.format("Total de coelhos: %d", c));
        System.out.println(String.format("Total de ratos: %d", r));
        System.out.println(String.format("Total de sapos: %d", s));
        System.out.println(String.format("Percentual de coelhos: %.2f %%", getPercent(c, total)));
        System.out.println(String.format("Percentual de ratos: %.2f %%", getPercent(r, total)));
        System.out.println(String.format("Percentual de sapos: %.2f %%", getPercent(s, total)));
    }

    public static int mapStringNumTypeToInt(String str){
        return Integer.parseInt(str.substring(0, str.length()-2));
    }

    public static float getPercent(int num, int total){
        float num1 = (float) num;
        float total1 = (float) total;
        return (num1*100) / total1;
    }

}