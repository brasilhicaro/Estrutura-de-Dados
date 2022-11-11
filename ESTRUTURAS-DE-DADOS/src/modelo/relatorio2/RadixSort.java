package modelo.relatorio2;

import java.util.List;

public class RadixSort {
	
	public static void radixSort(int[] vetor) {
		List[] auxiliar = new List[10];
		
		int maior = encontrarMaior(vetor);
		
		int qtd_repeticoes = 
	}
	
	
	public static int encontrarMaior(int[] vetor) {
		
		int maior = 0;
		
		for(int num :vetor) {
			
			if(num > maior) {
				
				maior = num;
				
			}
			
		}
			
		return maior;
	}
	
	public static int encontrarNumDigitos(int num) {
		
		int contador = 0;
		int numb;
		while (num > 1 ) {
			
			num/10;
			
			
		}
		
		return num;
	}
	
}
