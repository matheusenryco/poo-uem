package aula1509.exer01.application;


import aula1509.exer01.entities.Emprestimo;
import aula1509.exer01.entities.Livro;
import aula1509.exer01.entities.Usuario;

public class Biblioteca {
    public static void main(String[] args) {
        Livro livro01 = new Livro("Dom Casmurro", "Machado de Assis", "Romance",
                "Principis", 1899, 3, 208);

        Usuario usuario01 = new Usuario("Matheus Enryco", 19,
                "Masculino", "(44) 99999-999");

        Emprestimo emprestimo = new Emprestimo("15/09/2025", "22:30", livro01, usuario01);

        livro01.mostrarDadosLivro();
        usuario01.mostrarDadosUsuario();
        emprestimo.realizarEmprestimo();
        emprestimo.imprimirEmprestimo();

    }
}
