package BO;

import java.util.Scanner;

import DAO.DadosCaoDAO;
import DAO.MaeDAO;
import DAO.PaiDAO;
import DTO.DadosCao;
import DTO.Mae;
import DTO.Pai;

public class DogAlterar {
	
	public void funcaoAlterar() {
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
		System.out.println("|  ALTERAR INFORMAÇÕES DO CACHORRO  |");
		System.out.println("+-----------------------------------+");
		
		System.out.println(dl.getnMicroChip());
		System.out.print("Nome: ");
		resposta = entrada.next();
		dl.setNomeCao(resposta);
		
		System.out.print("Raca: ");
		resposta = entrada.next();	
		dl.setRaca(resposta);
		
		System.out.print("RegistroStudBook: ");
		resposta = entrada.next();	
		dl.setRegistroStudBook(resposta);
		
		System.out.print("Cor: ");
		resposta = entrada.next();	
		dl.setCor(resposta);
		
		System.out.print("Origem Raca: ");
		resposta = entrada.next();	
		dl.setOrigemRaca(resposta);
		
		System.out.print("Sexo: ");
		resposta = entrada.next();
		dl.setSexo(resposta);
		
		System.out.print("Criador : ");
		resposta = entrada.next();	
		dl.setCriador(resposta);
		
		System.out.print("Qual o numero MicroChip: ");
		x = entrada.nextInt();
		
		dl.setnMicroChip(x);
		p.setPk_pai(x);
		m.setPk_mae(x);
		
		
		System.out.println("+-----------------------------------+");
		System.out.println("|  ALTERAR INFORMAÇÕES DO PAI       |");
		System.out.println("+-----------------------------------+");
		
		System.out.print("Nome: ");
		resposta = entrada.next();
		p.setNomePai(resposta);
		
		System.out.print("RegistroStudBook");
		resposta = entrada.next();
		p.setRegistrostudbook(resposta);
		
		
		System.out.println("+-----------------------------------+");
		System.out.println("|  ALTERAR INFORMAÇÕES DO MAE       |");
		System.out.println("+-----------------------------------+");
		
		System.out.print("Nome: ");
		resposta = entrada.next();
		m.setNomemae(resposta);
		
		System.out.print("RegistroStudBook");
		resposta = entrada.next();
		m.setRegistrostudbook(resposta);
		
		
		Pdao.alterar(p);
		d.alterar(dl);
		Mdao.alterar(m);
		
		System.out.println("+-----------------------------------+");
		System.out.println("|  ALTERAÇÃO CONCLUIDA COM SUCESSO  |");
		System.out.println("+-----------------------------------+");
	}

}
