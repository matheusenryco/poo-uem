package aula0809.cenario01.entities;

public class Conta {
    private String nomeTitular;
    private int numConta;
    private double saldo;

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque de R$ " + valor);
        }
    }

    public void depositar(double valor) {
        if (valor >= 0) {
            this.saldo += valor;
            System.out.println("\nDepósito de R$ " + valor + " feito com sucesso!");
        }
        else {
            System.out.println("Valor de depósito inválido. Insira um valor maior que zero.");
        }
    }
}