package Faccat.exercicio03ao11;
import java.util.Scanner;

public class Exercicio007 {
    public static void main(String[] args) {
        Scanner idadeEmDiasScanner = new Scanner(System.in);

        System.out.println("Digite quantos ano você tem");
        int anos = idadeEmDiasScanner.nextInt();

        System.out.println("Digite quantos meses fazem desde o seu ultimo aniversário");
        int meses = idadeEmDiasScanner.nextInt();

        System.out.println("Digite quantos dias fazem desde o seu ultimo mêsversário");
        int dias = idadeEmDiasScanner.nextInt();

        System.out.printf("Você tem %s anos, %s meses e %s dias de idade %n",anos, meses, dias);

        anos = anos * 365;
        meses = meses * 30;

        int idadeDias = anos + meses + dias;

        System.out.println("O total da sua idade em dias é "+ idadeDias);
        idadeEmDiasScanner.close();
    }
}
