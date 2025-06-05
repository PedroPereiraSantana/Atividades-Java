package Faccat.exercicio14ao26;
import java.util.Scanner;

public class Exercicio022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o total de horas trabalhadas no mês");
        int totalHoras = scanner.nextInt();

        System.out.println("Digite o salário por hora");
        double salarioHora = scanner.nextInt();

        double totalSalario;

        if (totalHoras > 160) {
            int horaExtra = totalHoras - 160;
            totalSalario = ((double) horaExtra * salarioHora * 1.5) + salarioHora * 160;
        } else {
            totalSalario = totalHoras * salarioHora;
        }

        System.out.printf("O salário total com as horas adicionais ficou R$ %.2f", totalSalario);
    }
}
