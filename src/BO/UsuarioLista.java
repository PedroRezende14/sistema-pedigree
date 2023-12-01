package BO;
import java.util.List;
import java.util.Scanner;
import java.sql.SQLException;
import DTO.*;
import Conexao.Conexao;
import DAO.*;


public class UsuarioLista {
	
	
	public void UsuarioList() {
			Login l = new Login();
			LoginDAO ld = new LoginDAO();
			
			List<Login> users = ld.pesquisarTodos();
			System.out.println("+-----------------------------------+");
			System.out.println("|         DADOS DOS USUARIOS        |");
			System.out.println("+-----------------------------------+");
			for (int x=0;x<users.size();x++) {
				
				System.out.print(", Nome: ");
				System.out.print(users.get(x).getNome_usuario());
			
				System.out.print(", Email: ");
				System.out.print(users.get(x).getEmail_usuario());
				
				System.out.print(", Senha: ");
				System.out.println(users.get(x).getSenha_usuario());
				System.out.println("+-----------------------------------+");
			
			}
			
			
	}

}
