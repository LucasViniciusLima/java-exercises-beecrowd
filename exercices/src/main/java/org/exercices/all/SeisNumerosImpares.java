package org.exercices.all;
import java.util.Scanner;
/**
 * SeisNumerosImpares responsável por
 *
 * @author lucas
 * @since 2023-05-31
 */
public class SeisNumerosImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int numberRead = 0;

        while(numberRead < 6){
            if(number%2 != 0){
                numberRead++;
                System.out.println(number);
            }
            number++;
        }
    }
}
