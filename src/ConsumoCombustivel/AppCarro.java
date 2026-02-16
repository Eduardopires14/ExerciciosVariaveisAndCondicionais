package ConsumoCombustivel;

public class AppCarro {
    public static void main(String[] args) {

        Carro carro1 = new Carro(12.5, 50, 20, 200);
        carro1.calculaAutonomiaMaxima();
        carro1.calculaAutonomiaAtual();
        carro1.VerificaSeTemCombustivelParaPercurso();

        System.out.println(carro1);
    }
}
