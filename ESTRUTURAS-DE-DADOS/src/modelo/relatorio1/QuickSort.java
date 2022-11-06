package modelo.relatorio1;

import java.util.Random;

import utilitarios.TrocaElementos;

public class QuickSort {

	public static void quickSortOrdenarPivoAleatorio(String[] vetor, int inicio, int fim) {
			Random random = new Random();
			int indexPivo = random.nextInt(fim - inicio + 1) + inicio;      // Elemento aleatório como pivô.
			String pivo = vetor[indexPivo];
			int esq = inicio;
			int dir = fim;
			
			while(esq <= dir) {	
				while(esq < fim && vetor[esq].compareTo(pivo) < 0) {	
					esq++;	
				}while(dir > inicio && vetor[dir].compareTo(pivo) > 0) {	
					dir--;
				}
				if ( esq <= dir) {
					String auxiliar = vetor[esq];
					vetor[esq] = vetor[dir];
					vetor[dir] = auxiliar;
					esq++;
					dir--;
				}	
			}		
			if(inicio < dir) {
				quickSortOrdenarPivoAleatorio(vetor, inicio, dir);
			}
			if(esq < fim) {
				quickSortOrdenarPivoAleatorio(vetor, esq, fim);
			}		
		}
	
	public static void quickSortPrimeiroElemento(String[] vetor, int inicio, int fim) {
		String pivo = vetor[inicio]; 
		int esquerda = inicio;
		int direita = fim;
		while (esquerda <= direita) {
			
			while (esquerda <= fim && vetor[esquerda].compareTo(pivo) < 0)
				esquerda++;

			while (direita >= inicio && vetor[direita].compareTo(pivo) > 0)
				direita--;
			
			if (esquerda <= direita) {
				String auxiliar = vetor[esquerda];
				vetor[esquerda] = vetor[direita];
				vetor[direita] = auxiliar;
				esquerda++;
				direita--;
			}
		}
		if (esquerda < fim) 
			quickSortPrimeiroElemento(vetor, esquerda, fim);		
		if (direita > inicio) 
			quickSortPrimeiroElemento(vetor, inicio, direita);
	}
}