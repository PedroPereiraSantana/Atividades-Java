package exemplos;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o mês do ano que deseja escolher");
        int mesDoAno = scanner.nextInt();

        switch (mesDoAno){
            case 1:
                System.out.println("O mês escolhido foi Janeiro");
                break;
            case 2:
                System.out.println("O mês escolhido foi Fevereiro");
                break;
            case 3:
                System.out.println("O mês escolhido foi Março");
                break;
            case 4:
                System.out.println("O mês escolhido foi Abril");
                break;
            case 5:
                System.out.println("O mês escolhido foi Maio");
                break;
            case 6:
                System.out.println("O mês escolhido foi Junho");
                break;
            case 7:
                System.out.println("O mês escolhido foi Julho");
                break;
            case 8:
                System.out.println("O mês escolhido foi Agosto");
                break;
            case 9:
                System.out.println("O mês escolhido foi Setembro");
                break;
            case 10:
                System.out.println("O mês escolhido foi Outubro");
                break;
            case 11:
                System.out.println("O mês escolhido foi Novembro");
                break;
            case 12:
                System.out.println("O mês escolhido foi Desembro");
                break;
            default:
                System.out.println("O número escolhido não é valido");
                break;
        }

    }
}
