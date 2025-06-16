package exemplos;

public class Metodo008 {
    static int caclularSoma (int x, int y){
        return x + y;
    }

    static double calcularSoma(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        int exemplo1 = (int) calcularSoma(2, 3);
        System.out.println("Tipo int: " + exemplo1);
        double exemplo2 = calcularSoma(3.3, 4.4);
        System.out.println("Tipo double: "+ exemplo2);
    }
}
