package utilitarios;

public class TrocaElementos {
    public static void trocar(String[] sequencia, int i, int j) {
		String aux = sequencia[i];
		sequencia[i] = sequencia[j];
		sequencia[j] = aux;
	}
}
