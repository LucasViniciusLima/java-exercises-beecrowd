package org.exercices.all;

import java.io.IOException;
import java.util.Scanner;
/**
 * IdadeEmDias responsável por
 *
 * @author lucas
 * @since 2023-05-02
 */


public class IdadeEmDias {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double numTotalDias = sc.nextDouble();

        int anos = (int) (numTotalDias/365d);
        int meses = (int) ((numTotalDias % 365) / 30);
        int dias = (int) ((numTotalDias % 365) % 30);

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}