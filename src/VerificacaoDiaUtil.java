import java.util.Scanner;

public class VerificacaoDiaUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia da semana: ");
        String dia = scanner.nextLine();
        scanner.close();

        if (dia.equalsIgnoreCase("segunda") || dia.equalsIgnoreCase("terca") ||
                dia.equalsIgnoreCase("quarta") || dia.equalsIgnoreCase("quinta") ||
                dia.equalsIgnoreCase("sexta")) {
            System.out.println(dia + " é um dia útil.");
        } else {
            System.out.println(dia + " não é um dia útil.");
        }
    }
}   