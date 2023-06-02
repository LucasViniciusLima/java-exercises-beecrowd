package org.exercices.all;

import java.util.Scanner;

/**
 * ImpostoDeRenda responsável por
 *
 * @author lucas
 * @since 2023-06-02
 */
public class ImpostoDeRenda {
    public static void main(String[] args) {
        double value = (new Scanner(System.in)).nextDouble();
        double valPagar = 0;

        if(value <= 2000){
            System.out.println("Isento");
            return;
        }

        if(value >= 4500.01d){
            valPagar += (value-4500d) * 0.28;
            value -= value-4500;
        }

        if(value >= 3000.01d){
            valPagar += (value-3000d) * 0.18;
            value -= value-3000;
        }

        if(value >= 2000.01d){
            valPagar += (value-2000d) * 0.08;
        }

        System.out.printf("R$ %.2f\n", valPagar);
    }
}
