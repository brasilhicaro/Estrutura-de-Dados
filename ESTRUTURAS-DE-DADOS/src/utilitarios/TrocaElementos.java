package utilitarios;

public class TrocaElementos {
    public static void trocar(long[] v, int i, int j) {
		long aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
}
