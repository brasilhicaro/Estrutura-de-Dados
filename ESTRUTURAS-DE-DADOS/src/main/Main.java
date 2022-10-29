package main;

import java.util.Arrays;

import modelo.BubbleSort;
import utilitarios.*;

public class Main {
    public static void main(String[] args) {
        long[] sequencia = GeradorDeSequencias.geradorCinco(1230000);
        CalculaTempo calculaTempo = new CalculaTempo();
        long tempoInicial = System.nanoTime();

        BubbleSort.bubbleSort(sequencia);
        long tempoFinal = System.nanoTime();

        System.out.println(calculaTempo.resgataTempoFinal(tempoInicial, tempoFinal));
        System.out.println(Arrays.toString(sequencia));

    }
}