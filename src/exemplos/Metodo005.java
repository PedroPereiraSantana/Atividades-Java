package exemplos;

public class Metodo005 {
    static void metodo(int idade) {
        if (idade < 18){
            System.out.println("é menor de idade");
        } else {
            System.out.println("é maior de idade");
        }
    }

    public static void main(String[] args) {
        metodo(12);
        metodo(19);
    }
}
