package ProjetoFinal;

public class avosPai {
	
	private String avoPai;
	private String avoMae;
	
	public avosPai(String avoPai, String avoMae) {
		this.avoMae=avoMae;
		this.avoPai=avoPai;
	}
	
	public String getAvoPai() {
		return avoPai;
	}
	public void setAvoPai(String avoPai) {
		this.avoPai=avoPai;
	}
	public String getAvoMae(){
		return avoMae;
	}
	public void setAvoMae(String avoMae) {
		this.avoMae=avoMae;
	}

}
