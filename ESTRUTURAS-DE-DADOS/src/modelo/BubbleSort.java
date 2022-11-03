package modelo;

import utilitarios.TrocaElementos;

public class BubbleSort {
        public static void bubbleSort(String[] sequencia) {
                int tamanhoVetor = sequencia.length;
                for (int i = 0; i < tamanhoVetor; i++) {
                        boolean trocou = false;
                        for (int j = 1; j < (tamanhoVetor - i); j++) {
                                if (sequencia[j - 1].compareTo(sequencia[j]) > 0) {
                                        // troca elementos
                                        TrocaElementos.trocar(sequencia, j - 1, j);
                                        trocou = true;
                                }
                        }
                        //Aqui é feito a otimização
                        if (!trocou) {
                                break;
                        }
                }
        }
}