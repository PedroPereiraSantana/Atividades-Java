package Faccat.exercicio14ao26;
import java.util.Scanner;

public class Exercicio025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o número da conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo da conta");
        double saldo = scanner.nextDouble();

        System.out.println("Digite o valor total de transações o debito");
        double debito = scanner.nextDouble();

        System.out.println("Digite o saldo do crédito");
        double credito = scanner.nextDouble();

        int totalSaldo = (int) (saldo - debito + credito);


        if (totalSaldo < 0) {
            System.out.println("Saldo negativo");
        } else {
            System.out.println("Saldo positivo");
        }
    }
}
