package VIEW;
import java.util.Scanner;

import BO.*;

import java.io.IOException;

import java.sql.SQLException;
import DTO.*;
import Conexao.Conexao;
import DAO.*;
public class escolhasMain {
	
	
	public void Opc() {
		LimparTela lt = new LimparTela();
	
		Scanner entrada = new Scanner(System.in);
		DadosCao dl = new DadosCao();
		DadosCaoDAO d = new DadosCaoDAO();
		
		int opc = 0;
		int x ;	
		String resposta;
		
		
		while(opc != 8 ) {
			System.out.println("------------------------------------+");
			System.out.println("            Painel Adm              |");
			System.out.println("------------------------------------|");
			System.out.println("1 - Cadastrar Novo Cachorro         |");
			System.out.println("2 - Deletar Cadastro                |");
			System.out.println("3 - Procurar Cadastro por ID        |");
			System.out.println("4 - Alterar Informaçoes do Cachorro |");
			System.out.println("5 - Ver todos os Cadastros          |");
			System.out.println("6 - Remover Usuario 			    |");
			System.out.println("7 - Ver todos os Usuarios           |");
			System.out.println("8 - Sair                            |");
			System.out.println("------------------------------------+");
			
			
			opc = entrada.nextInt();
			
			lt.limparTela();
			if (opc == 1) {
				DogInserir di = new DogInserir();
				di.funcaoInserir();
			}
			
			if (opc == 2) {
				DogExcluir de = new DogExcluir();
				de.funcaoExcluir();
			}
		
			if (opc == 3) {
				DogProcurarId dp = new DogProcurarId();
				dp.FuncaoProcurar();
			}
			
			if (opc == 4) {
				DogAlterar da = new DogAlterar();
				da.funcaoAlterar();
			}
			
			if (opc == 5) {
				DogPesquisarTodos dpt = new DogPesquisarTodos();
				dpt.PesquisarTodos();
			}
			if (opc == 6) {
				UsuarioExcluir ue = new UsuarioExcluir();
				ue.mataUsuario();
			}
			if (opc == 7) {
				UsuarioLista ul = new UsuarioLista();
				ul.UsuarioList();
			}
			
		
			if(opc >7 || opc < 1) {
				System.out.println("Opção invalida"); 
			}

			
		}
		lt.limparTela();
		System.out.println("Saiu do sistema");
	}

}
