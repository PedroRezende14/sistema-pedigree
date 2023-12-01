package BO;

import java.util.List;

import DAO.DadosCaoDAO;
import DAO.MaeDAO;
import DAO.PaiDAO;
import DTO.DadosCao;
import DTO.Mae;
import DTO.Pai;

public class DogPesquisarTodos {
	
	
	public void PesquisarTodos(){
		
		DadosCao dl = new DadosCao();
		DadosCaoDAO d = new DadosCaoDAO();
		
		Pai p = new Pai();
		PaiDAO Pdao = new PaiDAO();
		
		Mae m = new Mae();
		MaeDAO Mdao = new MaeDAO();
		
		
		List<DadosCao> caes = d.pesquisarTodos();
		List<Pai> pais = Pdao.pesquisarTodos();
		List<Mae> maes = Mdao.pesquisarTodos();
		System.out.println("+-----------------------------------+");
		for (int x=0;x<caes.size();x++) {
			System.out.print(caes.get(x).getnMicroChip());
			System.out.println(" nMicroChip");
			
			System.out.println("+-----------------------------------+");
			System.out.print("Nome do Cao: ");
			System.out.print(caes.get(x).getNomeCao());
			System.out.print(", ");
			
			System.out.print("Raca: ");
			System.out.print(caes.get(x).getRaca());
			System.out.print(", ");
			
			System.out.print("Criador: ");
			System.out.print(caes.get(x).getCriador());
			System.out.print(", ");
			
			System.out.print("Registro Book: ");
			System.out.print(caes.get(x).getRegistroStudBook());
			System.out.print(", ");
			
			System.out.print("Cor: ");
			System.out.print(caes.get(x).getCor());
			System.out.print(" ");
			
			System.out.print("Origem Raca: ");
			System.out.print(caes.get(x).getOrigemRaca());
			System.out.print(", ");
			
			System.out.print("Sexo: ");
			System.out.print(caes.get(x).getSexo());
			System.out.println(", ");
			
			
			System.out.print("Nome do Pai: ");
			System.out.print(pais.get(x).getNomePai());
			System.out.print(", ");
			System.out.print("Registro book");
			System.out.print(pais.get(x).getRegistrostudbook());
			System.out.println("");
			
			System.out.print("Nome do Mae: ");
			System.out.print(maes.get(x).getNomemae());
			System.out.print(", ");
			System.out.print("Registro book");
			System.out.println(maes.get(x).getRegistrostudbook());
			
			
			
			
			
			System.out.println("+-----------------------------------+");
		//	System.out.print("Data: ");
		//	System.out.print(caes.get(x).getData());
		//	System.out.println(", ");
			
		}

		
	}
}
