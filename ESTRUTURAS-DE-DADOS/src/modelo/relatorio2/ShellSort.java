package modelo.relatorio2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ShellSort {

	public static void shellSort(long[] vetor, ArrayList<Integer> hs) {

		for (int h : hs) {
			for (int i = 0; (i + h) < vetor.length; i++) {
				int j = i + h;
				long n = vetor[j];
				while ((j - h) >= 0 && n < vetor[j - h]) {
					vetor[j] = vetor[j - h];
					j = j - h;
				}
				vetor[j] = n;
			}

		}
	}

	public static ArrayList<Integer> calcularHS(long[] vetor) {

		ArrayList<Integer> hs = new ArrayList<Integer>();

		int tam = vetor.length;
		int i = 1;
		while (i < tam) {

			int div = tam / 2;
			hs.add(div);
			tam = div;
		}
		return hs;
	}

	public static ArrayList<Integer> calcularHSVersao2(long[] vetor) {
		ArrayList<Integer> hss = new ArrayList<Integer>();
		int tam = vetor.length;
		int i = 1;
		int k = 1;
		while (i < tam) {
			hss.add(i);
			i = (int) (Math.pow(4, k) + 3 * Math.pow(2, k - 1) + 1);
			k++;
		}

		ArrayList<Integer> hs = new ArrayList<Integer>();
		int num;
		for (int j = hss.size() - 1; j > 0; j--) {

			num = hss.get(j);
			hs.add(num);
		}
		hs.add(1);
		return hs;
	}

}