package aula1209.exer02;

public class TestePorta {
    public static void main(String[] args) {
        Porta porta = new Porta();

        porta.setCor("Verde");
        porta.setDimensaoX(20);
        porta.setDimensaoY(5);
        porta.setDimensaoZ(15);

        System.out.println("Cor: " + porta.getCor());
        System.out.println("Dimensão X: " + porta.getDimensaoX());
        System.out.println("Dimensão Y: " + porta.getDimensaoY());
        System.out.println("Dimensão Z: " + porta.getDimensaoZ());

        porta.pinta("Azul");
        System.out.println("Nova cor: " + porta.getCor());


        porta.setDimensaoX(500);
        System.out.println("Nova dimensão X: " + porta.getDimensaoX());

        porta.Abre();
        porta.Fecha();
        porta.Abre();
        porta.Fecha();

        System.out.println("A porta está aberta? " + porta.getAberta());
    }
}