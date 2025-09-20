package aula1509.application;


import aula1509.entities.Emprestimo;
import aula1509.entities.Livro;
import aula1509.entities.Usuario;

public class Biblioteca {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", "Romance",
                "Principis", 1899, 3, 208);

        Usuario usuario = new Usuario("Matheus Enryco", 19,
                "Masculino", "(44) 99999-999");

        Emprestimo emprestimo = new Emprestimo("15/09/2025", "22:30", livro, usuario);

        livro.mostrarDadosLivro();
        usuario.mostrarDadosUsuario();
        emprestimo.realizarEmprestimo();
        emprestimo.imprimirEmprestimo();

        emprestimo.devolveLivro();
    }
}
