package BO;

import java.util.Scanner;
import java.sql.SQLException;
import DTO.*;
import Conexao.Conexao;
import DAO.*;

public class DogInserir {
	
	public void funcaoInserir() {
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
		System.out.println("|         DADOS DO CACHORRO         |");
		System.out.println("------------------------------------+");
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
		
		
		
		
		int valida = 1;
		
		if(valida == 1) {
			
			d.inserir(dl);
			
			System.out.println("+-----------------------------------+");
			System.out.println("|  CACHORRO ADICIONADO COM SUCESSO  |");
			System.out.println("+-----------------------------------+");
			
			System.out.println("+-----------------------------------+");
			System.out.println("|      DADOS DO PAI DO CACHORRO     |");
			System.out.println("------------------------------------+");
			
			System.out.print("Nome: ");
			resposta = entrada.next();
			p.setNomePai(resposta);
				
			System.out.print("RegistroStudBook");
			resposta = entrada.next();
			p.setRegistrostudbook(resposta);
			
			System.out.println("+-----------------------------------+");
			System.out.println("|    PAI ADICIONADO COM SUCESSO     |");
			System.out.println("+-----------------------------------+");
			Pdao.inserir(p);
			
			
			
			System.out.println("+-----------------------------------+");
			System.out.println("|      DADOS DO MAE DO CACHORRO       |");
			System.out.println("------------------------------------+");
			
			System.out.print("Nome: ");
			resposta = entrada.next();
			m.setNomemae(resposta);
				
			System.out.print("RegistroStudBook");
			resposta = entrada.next();
			m.setRegistrostudbook(resposta);
			
			System.out.println("+-----------------------------------+");
			System.out.println("|    MAE ADICIONADO COM SUCESSO     |");
			System.out.println("+-----------------------------------+");
			Mdao.inserir(m);
			
			
		}else {
			
		}
		
		}
	}


