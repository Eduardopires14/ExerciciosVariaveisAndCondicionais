package ClassificacaoPrecos;

public class AppProduto {
    public static void main(String[] args) {

        Produto produto1 = new Produto("SmartWatch", 527.30);
        produto1.avaliaCategoria(produto1.getPreco());

        System.out.println(produto1);

    }
}
