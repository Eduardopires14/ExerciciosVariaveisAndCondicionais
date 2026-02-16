import java.util.Scanner;

public class ConversorCelsiusEmFahrenheit {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius que deseja converter: ");
        int tempCelsius = leitura.nextInt();
        leitura.close();

        double conversao = converteCelsiusToFahrenheit(tempCelsius);
        System.out.println(conversao);

    }

    public static double converteCelsiusToFahrenheit(int Celcius) {
        double tempFahrenheit = (Celcius * 9 / 5) + 32;
        return tempFahrenheit;
    }
}
