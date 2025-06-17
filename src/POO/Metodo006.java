package POO;

public class Metodo006 {

    static int metodo(int numero){
        return numero + 1;
    }

    public static void main(String[] args) {
        System.out.println(metodo(4));
        System.out.println(metodo(5));
        System.out.println(metodo(2));


        int varivel = metodo(3);

        System.out.println(varivel);
    }
}
