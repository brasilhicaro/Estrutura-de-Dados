package main;

import modelo.BubbleSort;
import utilitarios.CalculaTempo;
import utilitarios.GeradorDeSequencias;

public class Main{
    public static void main(String[] args) {
        long[] sequencia = GeradorDeSequencias.geradorCinco(500000);
        CalculaTempo calculaTempo = new CalculaTempo();
        long tempoInicial = System.nanoTime();
        try {
            calculaTempo.setValores(0,tempoInicial);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        BubbleSort.bubbleSort(sequencia);
        long tempoFinal = System.nanoTime();
        try {
            calculaTempo.setValores(1,tempoFinal);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(calculaTempo.resgataTempoFinal());
    }
}