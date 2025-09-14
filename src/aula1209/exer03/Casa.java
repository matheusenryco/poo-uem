package aula1209.exer03;

import aula1209.exer02.Porta;

public class Casa {
    private String cor;
    private Porta porta01;
    private Porta porta02;
    private Porta porta03;

    public String getCor() {
        return cor;
    }

    public void setCor(String s) {
        this.cor = s;
    }

    public Porta getPorta01() {
        return porta01;
    }

    public void setPorta01(Porta p01) {
        this.porta01 = p01;
    }

    public Porta getPorta02() {
        return porta02;
    }

    public void setPorta02(Porta p02) {
        this.porta02 = p02;
    }

    public Porta getPorta03() {
        return porta03;
    }

    public void setPorta03(Porta p03) {
        this.porta03 = p03;
    }

    public void Pinta(String s) {
        this.cor = s;
    }

    public int quantasPortasEstaoAbertas() {
        int contaPortasAbertas = 0;

        if (porta01.estaAberta() == true) {
            contaPortasAbertas++;
        }
        if (porta02.estaAberta() == true) {
            contaPortasAbertas++;
        }
        if (porta03.estaAberta() == true) {
            contaPortasAbertas++;
        }
        return contaPortasAbertas;
    }
}
