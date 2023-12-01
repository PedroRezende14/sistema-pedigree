package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Conexao.Conexao;
import DTO.DadosCao;
import DTO.Mae;

public class MaeDAO {
	

	final String NOMEDATABELA = "Mae";
	public boolean inserir(Mae Mae){
		
		 try {
	            Connection conn = Conexao.conectar();
	            
	            String sql = "INSERT INTO Mae (nomemae,registrostudbook) VALUES (?, ?);";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, Mae.getNomemae());
	            ps.setString(2, Mae.getRegistrostudbook());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println("nao");
	            return false;
	        }
	    }
	

	public boolean Excluir(Mae Mae){
		 try {
	            Connection conn = Conexao.conectar();
	            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE pk_mae = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, Mae.getPk_mae());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	}
	

	
	// não está funcionando
	public boolean alterar(Mae Mae){
		try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET nomemae=?, registrostudbook=?"+" WHERE pk_mae=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, Mae.getNomemae());
            ps.setString(2, Mae.getRegistrostudbook());
            ps.setInt(3, Mae.getPk_mae());
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
	}
	
	public Mae procurarPorCodigo(Mae Mae){
		  try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE pk_mae = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            System.out.println();
	            ps.setInt(1, Mae.getPk_mae());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	            	Mae obj = new Mae();
	                
	                
	                System.out.println("======================================");
	                System.out.println("          Dados Do mae");
	                //int pk_pai = rs.getInt("pk_pai");
	                //System.out.print("nmicrochip: "+ pk_pai);
	                
	                String nomemae = rs.getString("nomemae");
	                System.out.print("nome: "+ nomemae);
	                
	                String bock = rs.getString("registrostudbook");
	                System.out.println(",RegistroBook:"+ bock);
	                
            
	                System.out.println("======================================");             
	                ps.close();
	                rs.close();
	                conn.close();
	                return obj;
	            } else {
	                ps.close();
	                rs.close();
	                conn.close();
	                return null;
	            }
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return null;
	        }
	    }
	
	 public List<Mae> montarLista(ResultSet rs) {
	        List<Mae> listObj = new ArrayList<Mae>();
	        try {
	            while (rs.next()) {
	            	Mae obj = new Mae();
	            	obj.setPk_mae(rs.getInt(1));
	            	obj.setNomemae(rs.getString(2));
	            	obj.setRegistrostudbook(rs.getString(3));
	            	
	                listObj.add(obj);
	            }
	            return listObj;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	 }
	 public List<Mae> pesquisarTodos() {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            List<Mae> listObj = montarLista(rs);
	            return listObj;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
		

}
