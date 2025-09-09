package aula0809.cenario02.application;

import aula0809.cenario02.entities.Funcionario;

public class ProgramFuncionarioMelhorado {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Matheus Enryco");
        funcionario.setDepartamento("TI");
        funcionario.setSalario(1000);
        funcionario.setEntradaBanco("01/01/2025");
        funcionario.setRg("10.101.010-1");

        System.out.println(funcionario.toString());

        System.out.println("\nAumento de R$ 500: ");
        funcionario.recebeAumento(500);

        System.out.println("Novo salário: " + funcionario.getSalario());

        double ganhoAnual = funcionario.calculaGanhoAnual();

        System.out.println("Ganho anual: " + ganhoAnual);
    }
}
