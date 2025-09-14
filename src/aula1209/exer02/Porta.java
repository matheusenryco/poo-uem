package aula1209.exer02;

public class Porta {
    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;

    public boolean getAberta() {
        return aberta;
    }

    public boolean setAberta(boolean aberta) {
        return this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    public void Abre() {
        System.out.println("Abriu");
        this.aberta = true;
    }

    public void Fecha() {
        System.out.println("Fechou");
        this.aberta = false;
    }

    public void pinta(String s) {
        this.cor = s;
    }

    public boolean estaAberta() {
        return this.aberta;
    }
}
