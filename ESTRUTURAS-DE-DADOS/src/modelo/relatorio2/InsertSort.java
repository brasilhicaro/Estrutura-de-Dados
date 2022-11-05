package modelo.relatorio2;

import utilitarios.TrocaElementos;

public class InsertSort {
    public static void insertionSort(long[] vetor) {
        int tamanhoVetor = vetor.length;
        for (int i = 1; i < tamanhoVetor - 1; i++) {
            long valorPosterior = vetor[i];
            for (int j = i - 1; j >= 0; j--) {
                long valorAtual = vetor[j];
                if (valorAtual > valorPosterior)
                    TrocaElementos.trocar(vetor, j, i);
                else
                    break;
            }
        }
    }
}
