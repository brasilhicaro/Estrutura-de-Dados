package modelo.relatorio1;

import utilitarios.TrocaElementos;

public class SelecaoDireta {

    public static void selecaoDireta(long[] vetor) {

        for (int j = 0; j < vetor.length; j++) {
            int menor = j;
            for (int i = j + 1; i < vetor.length; i++) {
                if (vetor[j] < vetor[i]) {
                    menor = i;
                    TrocaElementos.trocar(vetor, j, menor);
                }
            }
        }
    }
}
