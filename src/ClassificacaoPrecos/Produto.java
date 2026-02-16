package ClassificacaoPrecos;

public class Produto {
    private String nome;
    private double preco;
    private String categoria;

    public void avaliaCategoria(double preco){
        if (preco <= 50 ){
            this.categoria = "Econômico";
        } else if (preco >= 50.01 && preco <= 200 ) {
            this.categoria = "Intermediário";
        } else if (preco > 200) {
            this.categoria = "Premium";
        }
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
