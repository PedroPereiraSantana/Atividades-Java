package exemplos;
import java.util.Scanner;

public class SwitchCaseTernario {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o mês para saber a estação do ano que ele está");
        int mes = scanner.nextInt();

        String estacao = switch (mes){
            case 12, 1, 2 -> "Verão";
            case 3, 4, 5 -> "Outono";
            case 6, 7, 8 -> "Inverno";
            case 9, 10, 11 -> "Primavera";
            default -> "Mês invalido";
        };

        System.out.println("A estação do mês "+ mes + " está na estação do ano "+ estacao);
    }
}
