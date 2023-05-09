package org.exercices.all;

import java.io.IOException;
import java.util.Scanner;

/**
 * Media3 responsável por
 *
 * @author lucas
 * @since 2023-05-03
 */
public class Media3 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        double notaExame;
        double mediaPeso = calculaMediaComPeso(n1, n2, n3, n4);
        double mediaFinal;

        System.out.println(String.format("Media: %.1f", formatMedia(mediaPeso)));

        if(mediaPeso >= 7) {
            System.out.println("Aluno aprovado.");
        } else if(mediaPeso < 7 && mediaPeso >= 5){
            notaExame = sc.nextDouble();
            mediaFinal = (notaExame + mediaPeso) / 2;

            System.out.println("Aluno em exame.");
            System.out.println(String.format("Nota do exame: %.1f", notaExame));

            if(mediaFinal >= 5)
                System.out.println("Aluno aprovado.");
            else
                System.out.println("Aluno reprovado.");

            System.out.println(String.format("Media final: %.1f", formatMedia(mediaFinal)));
        } else {
            System.out.println("Aluno reprovado.");
        }



    }

    public static double calculaMediaComPeso(double n1, double n2, double n3, double n4){
        return ((n1 * 2) + (n2 * 3) + (n3 * 4) + n4) / 10;
    }

    public static double formatMedia(double mediaPeso){
        int numWithOneHouseByTem = (int) (mediaPeso*10);
        return numWithOneHouseByTem/10d;
    }

}
