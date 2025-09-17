package aula1509.exer01.entities;

public class Emprestimo {
    private String dataEmprestimo;
    private String hora;
    private Livro livro;
    private Usuario usuario;
    private boolean confirmado = false;

    public Emprestimo(String dataEmprestimo, String hora, Livro livro, Usuario usuario) {
        if(livro.isEmprestimo()) {
            this.dataEmprestimo = dataEmprestimo;
            this.hora = hora;
            this.livro = livro;
            this.usuario = usuario;
        }
        else {
            System.out.println("ERRO! O livro " + livro.getTitulo() + " não está disponível");
        }
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void realizarEmprestimo() {
        if (livro.isEmprestimo()) {
            System.out.println("Empréstimo feito com sucesso!");

            livro.setEmprestimo(false);
        }
        else {
            System.out.println("ERRO! O livro " + livro.getTitulo() + " não está disponível");
        }
    }

    public void imprimirEmprestimo() {
        System.out.println("\n=================DADOS DO EMPRÉSTIMO=================");
        System.out.println("Data do empréstimo: " + getDataEmprestimo() +
                            "\nHora do empréstimo: " + getHora() +
                            "\nLivro: " + livro.getTitulo() +
                            "\nUsuário: " + usuario.getNome());

        System.out.println("\nEmpréstimo feito com sucesso!");
    }

    public void devolveLivro() {
        livro.setEmprestimo(true);
    }
}
