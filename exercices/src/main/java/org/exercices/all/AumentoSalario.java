package org.exercices.all;
import java.util.Scanner;
/**
 * AumentoSalario responsável por
 *
 * @author lucas
 * @since 2023-06-01
 */
public class AumentoSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();

        double reajusteGanho = 0;
        double percentuais[] = { 15, 12, 10, 7, 4 };
        int index = -1;

        if(salary <= 400d){
            index = 0;
        } else if(salary <= 800d){
            index = 1;
        } else if(salary <= 1200d){
            index = 2;
        } else if(salary <= 2000d){
            index = 3;
        } else {
            index = 4;
        }

        reajusteGanho = salary * (percentuais[index]/100);
        salary += reajusteGanho;

        System.out.printf("Novo salario: %.2f\n", salary);
        System.out.printf("Reajuste ganho: %.2f\n", reajusteGanho);
        System.out.printf("Em percentual: %.0f", percentuais[index]);
        System.out.println(" %");
    }
}
