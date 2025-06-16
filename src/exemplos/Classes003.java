package exemplos;



public class Classes003 {

    String donoCarro;
    String modeloCarro;
    int anoCarro;

    public Classes003(String dono, String modelo, int ano){
        donoCarro = dono;
        modeloCarro = modelo;
        anoCarro = ano;

    }

    public static void main(String[] args) {
        Classes003 carro = new Classes003("falko", "kwid", 2025);
        Classes003 carro2 = new Classes003("Jaison", "Opala", 1987);
        Classes003 carro3 = new Classes003("Pedro", "Ferrari Basica", 2024);

        System.out.printf("O/a %s tem um carro do modelo %s do ano %d%n", carro.donoCarro, carro.modeloCarro, carro.anoCarro);
        System.out.printf("O/a %s tem um carro do modelo %s do ano %d%n", carro2.donoCarro, carro2.modeloCarro, carro2.anoCarro);
        System.out.printf("O/a %s tem um carro do modelo %s do ano %d%n", carro3.donoCarro, carro3.modeloCarro, carro3.anoCarro);
    }
}
