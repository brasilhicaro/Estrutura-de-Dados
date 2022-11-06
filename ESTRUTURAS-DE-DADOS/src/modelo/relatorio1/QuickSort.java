package modelo.relatorio1;

import java.util.Random;

import utilitarios.TrocaElementos;

public class QuickSort {

	public static void quickSortOrdenar(String[] vetor, int inicio, int fim) {
		if (fim > inicio) {
			int indexPivo = inicio;// primeiro elemento como pivô.
			
			int esq = inicio;
			int dir = fim;
			
			while(esq <= dir) {	
				while(esq < fim && vetor[esq].compareTo(vetor[indexPivo]) <= 0) {	
					esq++;	
				}while(dir > inicio && vetor[dir].compareTo(vetor[indexPivo]) >= 0) {	
					dir--;
				}
				if ( esq < dir) {
					TrocaElementos.trocarString(vetor, esq, dir);
					esq++;
					dir--;
				}	
			}		
			if(inicio < dir) {
				quickSortOrdenar(vetor, inicio, dir);
			}
			if(esq < fim) {
				quickSortOrdenar(vetor, esq, fim);
			}		
		}
	}
	
	public static void quickSortOrdenarPivoAleatorio(String[] vetor, int inicio, int fim) {
		
		if (fim > inicio) {
			int indexPivo = inicio + ((int) Math.random()*fim);      // Elemento aleatório como pivô.
			int esq = inicio;
			int dir = fim;
			
			while(esq <= dir) {	
				while(esq < fim && vetor[esq].compareTo(vetor[indexPivo]) <= 0) {	
					esq++;	
				}while(dir > inicio && vetor[dir].compareTo(vetor[indexPivo]) >= 0) {	
					dir--;
				}
				if ( esq < dir) {
					TrocaElementos.trocarString(vetor, esq, dir);
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
	}
}
