package utilitarios;

public class TrocaElementos {

	public static void trocar(long[] v, int i, int j) {
		long aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}

	public static void trocarString(String[] sequencia, int i, int j) {
		String aux = sequencia[i];
		sequencia[i] = sequencia[j];
		sequencia[j] = aux;
	}
}
