package aula1509.entities;

public class Emprestimo {
    private String dataEmprestimo;
    private String hora;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(String dataEmprestimo, String hora, Livro livro, Usuario usuario) {
            this.dataEmprestimo = dataEmprestimo;
            this.hora = hora;
            this.livro = livro;
            this.usuario = usuario;
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
        if (livro.isEmprestimo() == false) {
            System.out.println("Empréstimo do livro " + livro.getTitulo() + " feito com sucesso!");
            livro.setEmprestimo(true);
        }
        else {
            System.out.println("O livro não está disponível no momento.");
        }
    }

    public void imprimirEmprestimo() {
        System.out.println("\n=================DADOS DO EMPRÉSTIMO=================");
        System.out.println("Data do empréstimo: " + getDataEmprestimo()
                            + "\nHora do empréstimo: " + getHora()
                            + "\nLivro: " + livro.getTitulo()
                            + "\nUsuário: " + usuario.getNome());
    }

    public void devolveLivro() {
        if (livro.isEmprestimo() == true) {
            System.out.println("O Livro " + livro.getTitulo() + " foi devolvido.");
            livro.setEmprestimo(false);
        } else {
            System.out.println("Não é possivel devolver.");
        }
    }
}
