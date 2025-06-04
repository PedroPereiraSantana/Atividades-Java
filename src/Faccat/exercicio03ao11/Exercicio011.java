package Faccat.exercicio03ao11;
import java.util.Scanner;

public class Exercicio011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário fixo por mês");
        double salarioFixo = scanner.nextDouble();
        System.out.println("Digite a quantidade carros vendidas pelo vendedor esse mês");
        double quantidadeVendas = scanner.nextDouble();
        System.out.println("Digite o valor da comissão por carro vendido");
        double comissao = scanner.nextDouble();

        double totalComissao = quantidadeVendas * comissao;
        double salarioFinal = totalComissao / 100 * 5 + totalComissao + salarioFixo;

        System.out.println("O sálario final é R$ "+ salarioFinal);

    }
}
