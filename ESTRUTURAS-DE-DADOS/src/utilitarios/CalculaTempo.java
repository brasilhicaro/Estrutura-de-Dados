package utilitarios;

public class CalculaTempo {

    public long resgataTempoFinal(long tempoInicial, long tempoFinal) {

        return (tempoFinal - tempoInicial) / 1000000000;
    }
}
