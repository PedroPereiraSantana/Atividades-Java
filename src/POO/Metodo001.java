package POO;

/*
quando você não coloca nada antes da declaração do metodo ele vai ser public automaticamente
static void nomeDoMetodo() {}
public static void nomeDoMetodo(){}
é a mesma coisa;

static é por que não está associado a nenhum objeto;
se colocar sem o static ele está sendo associado a algum objeto;
*/

public class Metodo001 {
    static void meuMetodo() {
        System.out.println("está sendo executado");

    }

    public static void main(String[] args) {
        meuMetodo();
        meuMetodo();
        meuMetodo();
    }
}
