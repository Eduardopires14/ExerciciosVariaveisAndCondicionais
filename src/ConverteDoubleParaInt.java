import java.util.Scanner;

public class ConverteDoubleParaInt {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Olá!!, Bem-vindo ao conversor de números!");

        System.out.println("Digite o número que deseja converter: ");
        double valorFracionario = leitura.nextDouble();
        leitura.close();

        //CASTING EXPLÍCITO
        int valorInteiro = (int) valorFracionario;
        System.out.println(valorInteiro);


    }
}
