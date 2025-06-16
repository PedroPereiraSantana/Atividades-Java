package exemplos;

public class Classes002 {
    String primeiroNome = "";
    String ultimoNome = "";
    int idade = 0;

    void apresentar () {
        System.out.println("Olá, me chamo "+ primeiroNome + ", meu ultimo nome é "+ ultimoNome+ " e tenho "+ idade + " anos");

    }

    public static void main(String[] args) {
        Classes002 pessoa1 = new Classes002();

        pessoa1.primeiroNome = "Falko";
        pessoa1.ultimoNome = "Onico";
        pessoa1.idade = 18;

        pessoa1.apresentar();

    }
}
