import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculoMediaNotas {

    public static void main(String[] args) {
        List<Double> notasAlunos = new ArrayList<Double>();

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o número de notas de deseja fazer a média: ");
        int numeroNotas = leitura.nextInt();
        int i = 0;


        while (i < numeroNotas) {
            System.out.println("Digite a nota que deseja incluir: ");
            double nota = leitura.nextDouble();
            notasAlunos.add(nota);
            i++;
        }
        leitura.close();

        double media = calculaMedia(notasAlunos,numeroNotas);
        System.out.println(media);

    }

    public static double calculaMedia (List<Double> notas, int qtdNotas){
       double soma = 0;
       double media = 0;

        for (Double n : notas) {
            soma += n;
        }

        return media = soma/qtdNotas;
    }
}
