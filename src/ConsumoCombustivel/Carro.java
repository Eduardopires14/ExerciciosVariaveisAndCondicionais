package ConsumoCombustivel;

public class Carro {
    private double consumoMedio;
    private double capacidadeTanqueCombustivel;
    private double combustivelDisponivelAtual;
    private double distanciaPercurso;

    private double autonomiaTanqueCheio;
    private double autonomiaTanqueAtual;
    private String mensagem;

    public Carro(double consumoMedio, double capacidadeTanqueCombustivel, double combustivelDisponivelAtual, double distanciaPercurso) {
        this.consumoMedio = consumoMedio;
        this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
        this.combustivelDisponivelAtual = combustivelDisponivelAtual;
        this.distanciaPercurso = distanciaPercurso;
    }

    public void calculaAutonomiaMaxima (){
        this.autonomiaTanqueCheio = this.consumoMedio * this.capacidadeTanqueCombustivel;
    }

    public void calculaAutonomiaAtual (){
        this.autonomiaTanqueAtual = this.consumoMedio * this.combustivelDisponivelAtual;
    }

    public void VerificaSeTemCombustivelParaPercurso (){
        if (autonomiaTanqueAtual > distanciaPercurso){
            this.mensagem = "Combustível suficiente para o percurso! Viagem Autorizada!";
        } else {
            this.mensagem = "Não faça a viagem! Combustível insuficiente para o trajeto";
        }
    }

    @Override
    public String toString() {
        return "Relatório da Viagem [" +
                "distanciaPercurso = " + distanciaPercurso +
                ", autonomiaTanqueCheio = " + autonomiaTanqueCheio +
                ", autonomiaTanqueAtual = " + autonomiaTanqueAtual +
                ", mensagem = '" + mensagem + '\'' +
                ']';
    }
}
