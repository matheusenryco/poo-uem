package aula2209;

public class Automovel extends Terrestre {
    private String placa;
    private int numPortas;

    public Automovel() {
        super();
    }
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public void ImprimeDadosAutomoveis() {
        System.out.println("Os dados do seu automóvel é: "
                + "\nPlaca: " + getPlaca()
                + "\nNúmero de portas: " + getNumPortas()
                + "\nCapacidade: " + getCapacidade()
                + "\nNúmero de rodas: " + getNumRodas());
    }
}