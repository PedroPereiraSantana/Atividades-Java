package Faccat.exercicio14ao26;
import java.util.Scanner;

public class Exercicio024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário fixo ");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o total arrecadado pleas vendas do vendedor");
        double totalVendas = scanner.nextDouble();

        double valorTotal;

        if (totalVendas > 1500) {
            valorTotal = (double) 1500 / 100 * 3 + (totalVendas - 1500) / 100 * 5 + salarioFixo;
        } else {
            valorTotal = totalVendas / 100 * 3 + salarioFixo;
        }

        System.out.println("O salário total vai ser "+ valorTotal);
    }
}
