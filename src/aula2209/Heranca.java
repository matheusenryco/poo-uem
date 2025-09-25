package aula2209;

public class Heranca {
    public static void main(String[] args) {
        Automovel carro = new Automovel();
        Automovel moto = new Automovel();

        carro.setPlaca("GGG-0000");
        carro.setNumPortas(4);
        carro.setCapacidade(5);
        carro.setNumRodas(4);

        moto.setPlaca("GGG-0000");
        moto.setNumPortas(0);
        moto.setCapacidade(2);
        moto.setNumRodas(2);

        carro.ImprimeDadosAutomoveis();
    }
}