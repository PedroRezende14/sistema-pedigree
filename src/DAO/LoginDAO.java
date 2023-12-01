package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Conexao.Conexao;
import DTO.Login;
import DTO.Mae;
import VIEW.escolhasMain;

public class LoginDAO {
	

	final String NOMEDATABELA = "usuarios";
	public boolean inserir(Login Login){
		
		 try {
	            Connection conn = Conexao.conectar();
	            
	            String sql = "INSERT INTO usuarios (nome_usuario, senha_usuario, email_usuario) VALUES ( ?, ?, ?);";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, Login.getNome_usuario());
	            ps.setString(2, Login.getSenha_usuario());
	            ps.setString(3, Login.getEmail_usuario());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	

	public boolean Excluir(Login Login){
		 try {
	            Connection conn = Conexao.conectar();
	            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE id_usuario = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, Login.getId_usuario());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	}
	
	public List<Login> montarLista(ResultSet rs) {
        List<Login> listObj = new ArrayList<Login>();
        try {
            while (rs.next()) {
            	Login obj = new Login();
            	obj.setNome_usuario(rs.getString(1));
            	obj.setEmail_usuario(rs.getString(2));
            	obj.setSenha_usuario(rs.getString(3));
                listObj.add(obj);
            }
            return listObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
	 }
	 public List<Login> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Login> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
	 
	 
	 public Login Verifica (Login Login) {
			
		 try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE id_usuario = ? AND senha_usuario = ? ;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, Login.getId_usuario());
	            ps.setString(2, Login.getSenha_usuario());
	            ResultSet rs = ps.executeQuery();
	            Login listObj = Log(rs);
	            return listObj; 	
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return null;
	        }
		
	} 
	
	public Login Log(ResultSet rs) {
		
		List<Login> listObj = new ArrayList<Login>();
        try {
            while (rs.next()) {
            	Login obj = new Login();
            	obj.setId_usuario(rs.getInt(1));
            	obj.setSenha_usuario(rs.getString(2));
            	obj.setEmail_usuario(rs.getString(3));
                listObj.add(obj);
            }
            if(listObj.size() == 0) {
            	return null;
            }else {
            return listObj.get(0);}
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
		
	}
	
	

}
