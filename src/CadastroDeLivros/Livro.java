package CadastroDeLivros;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private double preco;
    private char categoria;

    public Livro(String titulo, String autor, int numeroPaginas, double preco, char categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.preco = preco;
        this.categoria = categoria;
    }

    public Livro() {

    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", preco=" + preco +
                ", categoria=" + categoria +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public double getPreco() {
        return preco;
    }

    public char getCategoria() {
        return categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
}
