package modelo.relatorio2;

import utilitarios.TrocaElementos;

public class InsertSort {
    public static void insertionSort(long[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int j = i + 1;
            long n = vetor[j];
            while(j > 0 && n < vetor[j-1]) {
                vetor[j] = vetor[j-1];
                j--;
            }
            vetor[j] = n;
        }
    }
}