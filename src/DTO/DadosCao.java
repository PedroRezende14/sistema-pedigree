package DTO;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.nio.file.*;



   public class DadosCao {
	public static final char[] NomeCao = null;
	private int nMicroChip;
	private String nomeCao;
	private String raca;
	private String RegistroStudBook;
	private String cor;	
	private String origemRaca;
	private Date data = new Date();
	private String criador;
	private String sexo;
	
	/*public DadosCao( String nomeCao, String raca,String RegistroStudBook, String cor, String origemRaca, String criador, String sexo){
		this.nomeCao = nomeCao;
		this.raca = raca;
		this.RegistroStudBook = RegistroStudBook;
		this.cor=cor;
		this.origemRaca=origemRaca;
		this.criador=criador;
		this.criador=criador;
		this.sexo=sexo;
	}
	
	public void fotoDog(String url) {
		
		Path fotoDog = Paths.get(url);
		
		if(Files.exists(fotoDog)) {
			System.out.println("foto existe");
		}
		else {
			System.out.println("foto não existe");
		}
	}
	*/
	
	
	
	public int getnMicroChip() {
		return nMicroChip;
	}
	public void setnMicroChip(int nMicroChip) {
		this.nMicroChip = nMicroChip;
	}
	public String getNomeCao() {
		return nomeCao;
	}
	public void setNomeCao(String nomeCao) {
		this.nomeCao = nomeCao;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getRegistroStudBook() {
		return RegistroStudBook;
	}
	public void setRegistroStudBook(String registroStudBook) {
		RegistroStudBook = registroStudBook;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getOrigemRaca() {
		return origemRaca;
	}
	public void setOrigemRaca(String origemRaca) {
		this.origemRaca = origemRaca;
	}
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	
	public String getCriador() {
		return criador;
	}
	public void setCriador(String criador) {
		this.criador = criador;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DadosCao \n [nMicroChip=");
		builder.append(nMicroChip);
		builder.append("\n nomeCao=");
		builder.append(nomeCao);
		builder.append("\n raca=");
		builder.append(raca);
		builder.append("\n RegistroStudBook=");
		builder.append(RegistroStudBook);
		builder.append("\n cor=");
		builder.append(cor);
		builder.append("\n origemRaca=");
		builder.append(origemRaca);
		builder.append("\n data Emissao =");
		builder.append(data);
		builder.append("\n criador=");
		builder.append(criador);
		builder.append("\n sexo=");
		builder.append(sexo);
		builder.append("]");
		return builder.toString();
	}

	
	
	

	
	
	
	
}
