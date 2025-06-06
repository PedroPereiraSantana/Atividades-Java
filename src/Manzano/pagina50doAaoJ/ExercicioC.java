package Manzano.pagina50doAaoJ;

public class ExercicioC {
    public static void main(String[] args) {
        int cont = 1;

        do {
            cont ++;

            if(cont % 4 == 0) {
                System.out.println(cont+ " é divisivel por 4");
            }
        } while (cont<200);
    }
}
