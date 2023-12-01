package BO;

import java.util.Scanner;

import DAO.DadosCaoDAO;
import DAO.MaeDAO;
import DAO.PaiDAO;
import DTO.DadosCao;
import DTO.Mae;
import DTO.Pai;

public class DogExcluir {
	
	public void funcaoExcluir() {
		
		Scanner entrada = new Scanner(System.in);
		
		DadosCao dl = new DadosCao();
		DadosCaoDAO d = new DadosCaoDAO();
		
		Pai p = new Pai();
		PaiDAO Pdao = new PaiDAO();
		
		Mae m = new Mae();
		MaeDAO Mdao = new MaeDAO();
		
		int opc = 0;
		int x ;	
		String resposta;
		System.out.println("+-----------------------------------+");
		System.out.println("|  REMOVER CADASTROO DO CACHORRO    |");
		System.out.println("+-----------------------------------+");
		
		System.out.print("Qual o numero MicroChip: ");
		x = entrada.nextInt();	
		
		dl.setnMicroChip(x);
		p.setPk_pai(x);
		m.setPk_mae(x);
			
		d.Excluir(dl);
		Pdao.Excluir(p);
		Mdao.Excluir(m);
		
		
		
		System.out.println("+-----------------------------------+");
		System.out.println("|  CADASTRO REMOVIDO COM SUCESSO    |");
		System.out.println("+-----------------------------------+");
		
	}

}
