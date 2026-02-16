package CadastroDeLivros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppLivro {
    public static void main(String[] args) {

        List<Livro> listaDeLivros = new ArrayList<Livro>();

        Livro livro = new Livro();

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do título do livro: ");
        livro.setTitulo(leitura.nextLine());

        System.out.println("Digite o nome do autor do livro: ");
        livro.setAutor(leitura.nextLine());

        System.out.println("Digite o número de páginas do livro: ");
        livro.setNumeroPaginas(leitura.nextInt());

        System.out.println("Digite o preço  do livro: ");
        livro.setPreco(leitura.nextDouble());

        System.out.println("Digite a categoria do livro: \nF - Ficção\nN - Não-Ficção\nT - Tecnologia\nH - História ");
        livro.setCategoria(leitura.next().charAt(0));

        leitura.close();

        listaDeLivros.add(livro);

        System.out.println(listaDeLivros);

    }
}
