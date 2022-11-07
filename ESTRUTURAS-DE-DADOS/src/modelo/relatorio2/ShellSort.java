package modelo.relatorio2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShellSort {

	public static void shellSort(long[] vetor, ArrayList<Integer> hs) {

		for (int h : hs) {
			for (int i = 0; (i+h) < vetor.length; i++) {
				int j = i + h;
				long n = vetor[j];
				while ((j-h) >= 0 && n < vetor[j - h]) {
					vetor[j] = vetor[j - h];
					j=j-h;
				}
				vetor[j] = n;
			}

		}
	}
	public static ArrayList<Integer> calcularHS(long[] vetor){
		
		ArrayList<Integer> hs = new ArrayList<Integer>(); 
		
		int tam = vetor.length;
		int i = 1;
		while(i < tam) {
			
			int div = tam/2;
			hs.add(div);
			tam = div;
		}
		return hs;
	}
	
}