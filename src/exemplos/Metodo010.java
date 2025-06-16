package exemplos;

public class Metodo010 {

    public static void main(String[] args) {
        int resultado = sum(5, 10);
        System.out.println(resultado);
    }


    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1); // ele adiciona e depois soma, basicamente 10 + 9, depois de executar denovo fica 10 + 9 + 8, e depois 10 + 9 + 8 + 7, ai só no final quando ele já concatenou tudo ele soma e devolve.
        } else {
            return end;
        }
    }
}
