package modelo.relatorio1;

import utilitarios.TrocaElementos;

public class HeapSort {
    
	public static void construirHeap(String[] vetor, int i, int f) {
		while(i <= f) {
			int maior = i;
			int esq = 2*i + 1;
			int dir = 2*i + 2;
			
			if(esq <= f && vetor[esq].compareTo(vetor[maior]) > 0){
				maior = esq;
			}if(dir <= f && vetor[dir].compareTo(vetor[maior]) > 0){
				maior = dir;
			}
			if(maior != i) {
				String aux = vetor[maior];
				vetor[maior] = vetor[i];
				vetor[i] = aux;
				i = maior;
				
			}else {
				return;
			}
		}
		
	}public static void heap_sort(String[] vetor){
		int f = vetor.length-1;
		
		for(int i = f; i >= 0; i--) {
			construirHeap(vetor,i,f);
		}
		while(f > 0) {
			String aux = vetor[f];
			vetor[f] = vetor[0];
			vetor[0] = aux;
			construirHeap(vetor,0,--f);
		}
	}
	
}
