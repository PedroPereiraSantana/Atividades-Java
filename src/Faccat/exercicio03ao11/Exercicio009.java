package Faccat.exercicio03ao11;

import java.util.Scanner;

public class Exercicio009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salario antes do aumento:");
        double salarioAntigo = scanner.nextDouble();

        System.out.println("Digite quantos por cento o salario aumentou:");
        double aumentoPorcento = scanner.nextDouble();

        double salarioAtual = salarioAntigo / 100 * aumentoPorcento + salarioAntigo;

        System.out.printf("O salario antigo no valor de %s R$, com o aumento de %s por cento, ficou um total de %s R$", salarioAntigo, aumentoPorcento, salarioAtual);
    }
}
