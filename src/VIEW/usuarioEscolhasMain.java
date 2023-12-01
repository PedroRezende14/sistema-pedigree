package VIEW;

import java.util.Scanner;

import BO.DogAlterar;
import BO.DogExcluir;
import BO.DogInserir;
import BO.DogPesquisarTodos;
import BO.DogProcurarId;
import BO.LimparTela;
import BO.UsuarioExcluir;
import BO.UsuarioLista;
import DAO.DadosCaoDAO;
import DTO.DadosCao;

public class usuarioEscolhasMain {
	public void pla() {
		LimparTela lt = new LimparTela();
	
		Scanner entrada = new Scanner(System.in);
		DadosCao dl = new DadosCao();
		DadosCaoDAO d = new DadosCaoDAO();
		
		int opc = 0;
		int x ;	
		String resposta;
		
		
		while(opc != 3 ) {
			System.out.println("------------------------------------+");
			System.out.println("            Painel Usuario          |");
			System.out.println("------------------------------------|");
			System.out.println("1 - Cadastrar Novo Cachorro         |");
			System.out.println("2 - Procurar Cadastro por ID        |");
			System.out.println("3 - Sair                            |");
			System.out.println("------------------------------------+");
			
			
			opc = entrada.nextInt();
			
			lt.limparTela();
			if (opc == 1) {
				DogInserir di = new DogInserir();
				di.funcaoInserir();
			}
			
					
			if (opc == 2) {
				DogProcurarId dp = new DogProcurarId();
				dp.FuncaoProcurar();
			}
			
		
			if(opc >4 || opc < 1) {
				System.out.println("Opção invalida"); 
			}

			
		}
		lt.limparTela();
		System.out.println("Saiu do sistema");
	}
}
