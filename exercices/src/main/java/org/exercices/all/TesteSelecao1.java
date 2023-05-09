package org.exercices.all;

import java.io.IOException;
import java.util.Scanner;

/**
 * TesteSelecao1 responsável por
 *
 * @author lucas
 * @since 2023-05-08
 */

public class TesteSelecao1 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if(isValid(a,b,c,d)){
            System.out.println("Valores aceitos");
        } else System.out.println("Valores nao aceitos");

    }

    public static boolean isValid(int a, int b, int c, int d){
        if(c >= b) return false;
        if(a >= d) return false;
        if(a+b >= c+d) return false;
        if(c < 0 || d < 0) return false;
        if (a % 2 != 0) return false;

        return true;
    }

}