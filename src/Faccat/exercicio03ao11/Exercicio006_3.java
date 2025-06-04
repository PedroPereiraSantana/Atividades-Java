package Faccat.exercicio03ao11;

import java.util.Scanner;

public class Exercicio006_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura do triangulo");
        double altura = scanner.nextDouble();

        System.out.println("Digite o tamanho da altura do triangulo");
        double base = scanner.nextDouble();

        double areaTotal = altura * base / 2;

        System.out.println("A área total do triangulo é "+areaTotal+ " CM²");
    }
}
