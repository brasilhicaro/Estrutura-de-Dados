package utilitarios;

public class CalculaTempo{
	private long[] temposDeCusto = new long[2];

    public long[] getTemposDeCusto() {
        return temposDeCusto;
    }
    public void setValores(int index, long tempoDeCusto) throws Exception {
        if(index>= 0 && index <2){
            temposDeCusto[index]= tempoDeCusto;
        }
		else 
			throw new Exception("Index inválido");
    }

	public long resgataTempoFinal() {
        
		long timeInicial = temposDeCusto[0];
		
		long timeFinal = temposDeCusto[1];
    
    	return (timeFinal - timeInicial)/1000000000;
		
	}
}
