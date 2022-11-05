package utilitarios;

public class TrocaElementos {
	public static void trocar(String[] sequencia, int i, int j) {
=======
>>>>>>> Stashed changes

	public static void trocar(long[] v, int i, int j) {
		long aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}

	public static void trocarString(String[] sequencia, int i, int j) {
<<<<<<< Updated upstream
=======
>>>>>>> 3f5ce9ad68d25b204fc21a7b5929e0c37f632b00
>>>>>>> Stashed changes
		String aux = sequencia[i];
		sequencia[i] = sequencia[j];
		sequencia[j] = aux;
	}
}
