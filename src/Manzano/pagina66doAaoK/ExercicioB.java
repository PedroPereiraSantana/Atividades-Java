package Manzano.pagina66doAaoK;

import java.util.Scanner;

public class ExercicioB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número que deseja ver a tabuda");
        int num = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            int mult = i * num;
            System.out.printf("%d X %d = %d %n", num, i, mult);
        }
    }
}
