package org.exercices.all;

import java.util.Scanner;

/**
 * TempoJogoComMinutos responsável por
 *
 * @author lucas
 * @since 2023-05-30
 */
public class TempoJogoComMinutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();

        int horasGasta = 0;
        int minutosGasto = 0;

        if (h1 == h2) {
            if (m1 == m2) {
                horasGasta = 24;
            } else if (m2 < m1) {
                horasGasta = 23;
                minutosGasto = 60 - (m1 - m2);
            } else {
                minutosGasto = m2 - m1;
            }
        }

        if (h2 < h1) {
            if (m1 == m2) {
                horasGasta = 24 - (h1 - h2);
            } else if (m2 < m1) {
                horasGasta = 24 - (h1 - h2) - 1;
                minutosGasto = 60 - (m1 - m2);
            } else {
                horasGasta = 24 - (h1 - h2);
                minutosGasto = m2 - m1;
            }
        }

        if (h1 < h2) {
            if (m1 == m2) {
                horasGasta = h2 - h1;
            } else if (m2 < m1) {
                horasGasta = h2 - h1 - 1;
                minutosGasto = 60 - (m1 - m2);
            } else {
                horasGasta = h2 - h1;
                minutosGasto = m2 - m1;
            }
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horasGasta, minutosGasto);
    }
}
