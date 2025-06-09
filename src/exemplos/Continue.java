package exemplos;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue; // ele faz com que o looping continue sem executar as outras linhas e voltado para o início;
            }
            System.out.println(i);
        }
    }
}
