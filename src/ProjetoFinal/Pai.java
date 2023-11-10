package ProjetoFinal;

public class Pai {

	private String nomePai;
	private int nMicroChip;
	
	public Pai(String nomePai, int nMicroChip) {
		this.nomePai=nomePai;
		this.nMicroChip=nMicroChip;
	}
	
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public int getnMicroChip() {
		return nMicroChip;
	}
	public void setnMicroChip(int nMicroChip) {
		this.nMicroChip = nMicroChip;
	}
	
	
	
}
