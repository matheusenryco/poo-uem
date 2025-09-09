package aula0809.cenario02.application;

import aula0809.cenario02.entities.Funcionario;

public class ProgramFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Matheus Enryco");
        funcionario.setDepartamento("TI");
        funcionario.setSalario(1000);
        funcionario.setEntradaBanco("01/01/2025");
        funcionario.setRg("10.101.010-1");

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Departamento: " + funcionario.getDepartamento());
        System.out.println("Salário: R$ " + funcionario.getSalario());
        System.out.println("Data de entrada: " + funcionario.getEntradaBanco());
        System.out.println("RG: " + funcionario.getRg());

        System.out.println("\nAplicando aumento de R$ 200");
        funcionario.recebeAumento(200);

        System.out.println("Novo salário: " + funcionario.getSalario());

        double ganhoAnual = funcionario.calculaGanhoAnual();

        System.out.println("Ganho anual: " + ganhoAnual);
    }
}
