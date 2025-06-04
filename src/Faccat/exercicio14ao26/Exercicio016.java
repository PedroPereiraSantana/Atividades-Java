package Faccat.exercicio14ao26;
import java.util.Scanner;

public class Exercicio016 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o total de maçãs compradas");
        int totalMaca = scanner.nextInt();
        double valorFinal = 0;

        if (totalMaca > 11) {
            valorFinal = totalMaca;
        }else {
            valorFinal = totalMaca * 1.30;
        }

        System.out.println("O valor final ficou R$ " + valorFinal);
    }
}
