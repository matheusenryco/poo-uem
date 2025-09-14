package aula0809.cenario02.entities;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String entradaBanco;
    private String rg;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEntradaBanco() {
        return entradaBanco;
    }

    public void setEntradaBanco(String entradaBanco) {
        this.entradaBanco = entradaBanco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double recebeAumento(double aumento) {
        return salario += aumento;
    }

    public double calculaGanhoAnual() {
        return salario * 12;
    }

    public String toString() {
        return "Nome: " + nome + "\nDepartamento: " + departamento + "\nSalário: " + salario + "\nData de entrada: " + entradaBanco + "\nRG: " + rg;
    }
}
