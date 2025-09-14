package aula1209.exer03;

import aula1209.exer02.Porta;

public class TesteCasa {
    public static void main(String[] args) {
        Casa casa = new Casa();
        Porta porta01 = new Porta();
        Porta porta02 = new Porta();
        Porta porta03 = new Porta();

        casa.setCor("Branca");
        casa.setPorta01(porta01);
        casa.setPorta02(porta02);
        casa.setPorta03(porta03);

        System.out.println("A casa é da cor: " + casa.getCor());

        casa.getPorta01().pinta("Laranja");
        casa.getPorta02().pinta("Lilás");

        System.out.println("A cor da porta 01 é: " + casa.getPorta01().getCor());
        System.out.println("A cor da porta 02 é: " + casa.getPorta02().getCor());

        porta02.Abre();
        porta03.setDimensaoX(50);
        porta01.Abre();
        porta03.Abre();
        porta01.Fecha();
        porta01.Abre();

        System.out.println("Quantas portas estão abertas: " + casa.quantasPortasEstaoAbertas());

        casa.Pinta("Azul");
    }
}
