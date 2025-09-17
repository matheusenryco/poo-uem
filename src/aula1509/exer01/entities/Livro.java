package aula1509.exer01.entities;

public class Livro {
    private String titulo;
    private String autor;
    private String area;
    private String editora;
    private int ano;
    private int edicao;
    private int numFolhas;
    private boolean emprestimo = false;

    public Livro(String titulo, String autor, String area, String editora, int ano, int edicao, int numFolhas) {
        this.titulo = titulo;
        this.editora = editora;
        this.autor = autor;
        this.area = area;
        this.ano = ano;
        this.edicao = edicao;
        this.numFolhas = numFolhas;
        this.emprestimo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {this.editora = editora;}

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getNumFolhas() {
        return numFolhas;
    }

    public void setNumFolhas(int numFolhas) {
        this.numFolhas = numFolhas;
    }

    public boolean isEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }

    public void mostrarDadosLivro() {
        System.out.println("=================DADOS DO LIVRO=================");
        System.out.println("Nome: " + getTitulo() + "\nAutor: " + getAutor() + "\nÁrea: " + getArea()
        + "\nEditora: " + getEditora() + "\nAno: " + getAno() + "\nEdição: " + getEdicao() + "\nNúmero de páginas: " + getNumFolhas());
    }
}


