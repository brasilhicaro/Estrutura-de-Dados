package utilitarios;
public class Conversor {
	public static int converterLetraNumero(char c) {
		int valor = 0;
		if(c == 'a') {	
			valor = 10;
		}else if(c == 'b') {
			valor = 11;
		}else if(c == 'c') {
			valor = 12;
		}else if(c == 'd') {
			valor = 13;
		}else if(c == 'e') {
			valor = 14;
		}else if(c == 'f') {
			valor = 15;			
		}
		return valor;
	}
}
