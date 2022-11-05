package modelo.relatorio1;

import utilitarios.TrocaElementos;

public class HeapSort {
    public static void heapSortLong(long[] vetor) {
        int tamanho = vetor.length-1;
        for(int i= 0;i< tamanho;i++){
            int f = i + 1;
            while(f > 1 && vetor[f/2] < vetor[f]){
                TrocaElementos.trocar(vetor, f, f/2);
                f /= 2;
            }
        }
    }
    public static void HeapSortString(String[] vetor) {

    }
}
