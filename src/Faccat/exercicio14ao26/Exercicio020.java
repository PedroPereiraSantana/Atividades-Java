package Faccat.exercicio14ao26;
import java.util.Scanner;

public class Exercicio020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo valor");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2){
            System.out.println(numero2 + " " + numero1);
        } else {
            System.out.println(numero1 + " " + numero2);
        }
    }
}
