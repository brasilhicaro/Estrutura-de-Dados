package modelo;

import utilitarios.TrocaElementos;

public class BubbleSort {
        public static void bubbleSort(long[] vetor) {
                int n = vetor.length;
                boolean controle = true;
                for (int i = 0; i < n; i++) {
                        for (int j = 1; j < (n - i); j++) {
                                if (vetor[j - 1] > vetor[j]) {
                                        // troca elementos
                                        TrocaElementos.trocar(vetor, j - 1, j);
                                        controle = false;
                                }

                        }
                        //Aqui é feito a otimização
                        if (controle) {
                                break;
                        }
                }

        }
}