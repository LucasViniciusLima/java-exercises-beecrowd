package org.exercices.all;

import java.io.IOException;
import java.util.Scanner;

/**
 * Bhaskara responsável por
 *
 * @author lucas
 * @since 2023-05-09
 */
public class Bhaskara {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = Math.sqrt(raizQuadradaDelta(a,b,c));

        if(delta <= 0 || a == 0 || (2*a) == 0.0){
            System.out.println("Impossivel calcular");
            return;
        }

        double resultA = (double) (-b + delta) / (2d*a);
        double resultB = (double) (-b - delta) / (2d*a);

        if(Double.isNaN(resultA) || Double.isNaN(resultB)){
            System.out.println("Impossivel calcular");
            return;
        }

        System.out.println(String.format("R1 = %.5f", resultA));
        System.out.println(String.format("R2 = %.5f", resultB));
    }

    public static double raizQuadradaDelta(double a, double b, double c){
        return (b*b) - (4*a*c);
    }
}
