package main;

import java.util.Arrays;


import modelo.relatorio1.*;
import utilitarios.*;

public class Main {
    public static void main(String[] args) {
        String[] sequencia = GeradorDeSequencias.geradorNove(50000);
        CalculaTempo calculaTempo = new CalculaTempo();
        long tempoInicial = System.nanoTime();
        
        //System.out.println(Arrays.toString(sequencia));
        
        BubbleSort.bubbleSort(sequencia);
        long tempoFinal = System.nanoTime();

        
        System.out.println(Arrays.toString(sequencia));
        System.out.println(calculaTempo.resgataTempoFinal(tempoInicial, tempoFinal));
        
        
        
        //QuickSort quickSort = new QuickSort();
        
        //System.out.println(Arrays.toString(sequencia));
        
        //quickSort.ordenarVetorDeInteiros(sequencia);
        
        //System.out.println(Arrays.toString(sequencia));
        
        
    }
}