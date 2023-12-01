package DTO;
import java.util.Arrays;
import java.util.HashMap;

public class Ninhada {

	private int nNinhada;
	
	public Ninhada(int nNinhada) {
		this.nNinhada=nNinhada;
	}
	public int getnNinhada() {
		return nNinhada;
	}
	public void setnNinhada(int nNinhada) {
		this.nNinhada = nNinhada;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ninhada [nNinhada=");
		builder.append(nNinhada);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
	
}
