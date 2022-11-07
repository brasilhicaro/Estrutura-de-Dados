package modelo.relatorio2;

import java.util.Arrays;

public class MergeSort {

	public static void intercala(long[] sequencia, int inicio, int meio, int fim) {
		long novoVetor[] = new long[fim - inicio];
		int i = inicio;
		int m = meio;
		int pos = 0;
		while (i < meio && m < fim) {
			if (sequencia[i] <= sequencia[m]) {
				novoVetor[pos] = sequencia[i];
				pos = pos + 1;
				i = i + 1;
			} else {
				novoVetor[pos] = sequencia[m];
				pos = pos + 1;
				m = m + 1;
			}
		}
		while (i < meio) {
			novoVetor[pos] = sequencia[i];
			pos = pos + 1;
			i = i + 1;
		}
		while (m < fim) {
			novoVetor[pos] = sequencia[m];
			pos = pos + 1;
			m = m + 1;
		}
		for (pos = 0, i = inicio; i < fim; i++, pos++) {
			sequencia[i] = novoVetor[pos];
		}
	}

	public static void mergeSortRecursivo(int inicio, int fim, long[] sequencia) {
		if (inicio < fim - 1) {
			int meio = (inicio + fim) / 2;
			mergeSortRecursivo(inicio, meio, sequencia);
			mergeSortRecursivo(meio, fim, sequencia);
			intercala(sequencia, inicio, meio, fim);
		}
	}
}

//Fonte: http://www.universidadejava.com.br/pesquisa_ordenacao/merge-sort/
