package ProjetoFinal;

import java.text.SimpleDateFormat;

public class ProjetoFinalMain {

	public static void main(String[] args) {
		
		// Declarando os avos do cachorro;
		// nome do pai e da mae
		avosMae avMae = new avosMae("Valentin","Pandora");
		avosPai avPai= new avosPai("Daniel","Pipoca");
		
		// Declarando os Pais do cachorro;
		//Nome & id 
		Mae m = new Mae("valdiscleia", 512);
		Pai p = new Pai("Tor" , 531);
		
		// Ninhada
		//pergunta pro professor como arrumar isso 	
		//Ninhada n = new Ninhada(4,"w2","223","e2e");
		
		//Propietario- nome - Endereço
		Propietario Pro = new Propietario("Rezende", "rua frederico pinto miguel");
		
		
		// dados do cachorro
		// nMicroChip,nomeCao,raca,RegistroStudBook, cor, origemRaca, dataEmicao ,dataNascimento, criador, sexo
		DadosCao dc = new DadosCao(1, "scoob", "dorbeman", "KO235L3", "cinza", "alemã", null, null, "Jose", "masculino");
		
		
		
		
		
		
	}

}
