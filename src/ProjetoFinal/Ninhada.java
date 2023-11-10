package ProjetoFinal;

public class Ninhada {
	
	private int nNinhada;
	private String[] nomeCachorros = new String[6];
		
	public Ninhada(int nNinhada, String nomeCachorro) {
	}

	public int getnNinhada() {
		return nNinhada;
	}

	public void setnNinhada(int nNinhada) {
		this.nNinhada = nNinhada;
	}

	public String[] getNomeCachorros() {
		return nomeCachorros;
	}

	public void setNomeCachorros(String[] nomeCachorros) {
		this.nomeCachorros = nomeCachorros;
	}

}
