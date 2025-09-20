package aula1909;

public class AgendaTeste {
    public static void main(String[] args) {
        Agenda agenda01 = new Agenda();
        Agenda agenda02 = new Agenda();

        agenda01.anote(31, 01, 2021, "Final da libertadores Palmeiras x Santos");
        agenda02.anote(33, 11, 2021, "Final Palmeiras x Flamengo");
        agenda01.mostraAnotacao();
        agenda02.mostraAnotacao();
    }
}
