package VIEW;

import java.util.Scanner;

import BO.*;

import java.io.IOException;

import java.sql.SQLException;
import DTO.*;
import Conexao.Conexao;
import DAO.*;

	

public class LoginMain {
	LimparTela lt = new LimparTela();
	Scanner entrada = new Scanner(System.in);
	UsuarioAdd au  = new UsuarioAdd();
			
	escolhasMain em = new escolhasMain();
	

	
	public void inicio() {
		int opc=0;
		
		while(opc != 3 ) {
			System.out.println("------------------------------------+");
			System.out.println("              Bem Vindo             |");
			System.out.println("------------------------------------|");
			System.out.println("1 - Login							|");
			System.out.println("2 - Registrar                       |");
			System.out.println("3 - sair                            |");
			System.out.println("------------------------------------+");
			opc = entrada.nextInt();
			
			lt.limparTela();
			if (opc == 1) {
				Valida v = new Valida();
				v.chek();
			}
			
			if (opc == 2) {
				au.InserirUsuario();
			}
		
			if(opc >4 || opc < 1) {
				System.out.println("Numero invalido"); 
			}
		}
	}
}