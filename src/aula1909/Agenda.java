package aula1909;

public class Agenda {
    int dia;
    int mes;
    int ano;
    String anotacao;

    void anote(int dia, int mes, int ano, String anotacao) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            this.anotacao = anotacao;
    }

    void validaData() {
        if ((dia < 0) || (dia > 31) || (mes < 0) || (mes > 12)) {
            this.dia = 0;
            this.mes = 0;
            this.ano = 0;
            this.anotacao = "ANOTAÇÃO NÃO INSERIDA: DATA INVÁLIDA";
        }
    }

    void mostraAnotacao() {
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano + ":" + this.anotacao);
    }
}
