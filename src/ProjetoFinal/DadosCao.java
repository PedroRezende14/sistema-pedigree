package ProjetoFinal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DadosCao {
	
	private int nMicroChip;
	private String nomeCao;
	private String raca;
	private String RegistroStudBook;
	private String cor;
	private String origemRaca;
	private SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
	private SimpleDateFormat dataNascimento = new SimpleDateFormat("dd/MM/yyyy");
	private String criador;
	private String sexo;
	
	public DadosCao(int nMicroChip, String nomeCao, String raca,String RegistroStudBook, String cor, String origemRaca,
			SimpleDateFormat data ,SimpleDateFormat dataNascimento, String criador, String sexo){
		
		this.nMicroChip = nMicroChip;
		this.nomeCao = nomeCao;
		this.raca = raca;
		this.RegistroStudBook = RegistroStudBook;
		this.cor=cor;
		this.origemRaca=origemRaca;
 		this.data=data;
		this.dataNascimento=dataNascimento;
		this.criador=criador;
		this.criador=criador;
		this.sexo=sexo;
	}
	
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
	public SimpleDateFormat getData() {
		return data;
	}
	public void setData(SimpleDateFormat data) {
		this.data = data;
	}
	public SimpleDateFormat getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNacimento(SimpleDateFormat dataNascimento) {
		this.dataNascimento = dataNascimento;
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
	
	
}
