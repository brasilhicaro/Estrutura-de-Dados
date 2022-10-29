package modelo;

import utilitarios.TrocaElementos;

public class BubbleSort {
        public static void bubbleSort(long[] vetor) {
                int tamanhoVetor = vetor.length;
                for (int i = 0; i < tamanhoVetor; i++) {
                        boolean trocou = false;
                        for (int j = 1; j < (tamanhoVetor - i); j++) {
                                if (vetor[j - 1] > vetor[j]) {
                                        // troca elementos
                                        TrocaElementos.trocar(vetor, j - 1, j);
                                        trocou = true;
                                }
                        }
                        //Aqui � feito a otimiza��o
                        if (!trocou) {
                                break;
                        }
                }
        }
}