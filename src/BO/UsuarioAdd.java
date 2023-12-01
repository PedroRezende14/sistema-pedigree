package BO;
import java.util.Scanner;
import java.sql.SQLException;
import DTO.*;
import Conexao.Conexao;
import DAO.*;

public class UsuarioAdd {
	
	public void InserirUsuario() {
		Login l = new Login();
		LoginDAO ld = new LoginDAO();
		Scanner entrada = new Scanner(System.in);
		
		String resposta;
		int n;
		
		System.out.println("+-----------------------------------+");
		System.out.println("|         DADOS DO USUARIO          |");
		System.out.println("------------------------------------+");
		
		System.out.print("Nome: ");
		resposta = entrada.next();
		l.setNome_usuario(resposta);

		System.out.print("Senha: ");
		resposta = entrada.next();
		l.setSenha_usuario(resposta);
		
		System.out.print("Email: ");
		resposta = entrada.next();
		l.setEmail_usuario(resposta);
		
		System.out.println("+-----------------------------------+");
		System.out.println("|         USUARIO REGISTRADO        |");
		System.out.println("------------------------------------+");
		
		ld.inserir(l);
		
	}

}
