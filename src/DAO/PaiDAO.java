package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Conexao.Conexao;
import DTO.DadosCao;
import DTO.Pai;

public class PaiDAO {
		
		final String NOMEDATABELA = "Pai";
		public boolean inserir(Pai Pai){
			
			 try {
		            Connection conn = Conexao.conectar();
		            
		            String sql = "INSERT INTO pai (nomepai,registrostudbook) VALUES (?, ?);";
		            PreparedStatement ps = conn.prepareStatement(sql);
		            ps.setString(1, Pai.getNomePai());
		            ps.setString(2, Pai.getRegistrostudbook());
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
		

		public boolean Excluir(Pai Pai){
			 try {
		            Connection conn = Conexao.conectar();
		            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE pk_pai = ?;";
		            PreparedStatement ps = conn.prepareStatement(sql);
		            ps.setInt(1, Pai.getPk_pai());
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
		public boolean alterar(Pai Pai){
			try {
	            Connection conn = Conexao.conectar();
	            String sql = "UPDATE " + NOMEDATABELA + " SET nomepai=?, registrostudbook=?"+" WHERE pk_pai=?";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, Pai.getNomePai());
	            ps.setString(2, Pai.getRegistrostudbook());
	            ps.setInt(3, Pai.getPk_pai());
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
		}
		
		public Pai procurarPorCodigo(Pai Pai){
			  try {
		            Connection conn = Conexao.conectar();
		            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE pk_pai = ?;";
		            PreparedStatement ps = conn.prepareStatement(sql);
		            System.out.println();
		            ps.setInt(1, Pai.getPk_pai());
		            ResultSet rs = ps.executeQuery();
		            if (rs.next()) {
		                Pai obj = new Pai();
		                
		                
		                System.out.println("======================================");
		                System.out.println("          Dados Do Pai");
		                //int pk_pai = rs.getInt("pk_pai");
		                //System.out.print("nmicrochip: "+ pk_pai);
		                
		                String nomepai = rs.getString("nomepai");
		                System.out.print("nome: "+ nomepai);
		                
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
		
		 public List<Pai> montarLista(ResultSet rs) {
		        List<Pai> listObj = new ArrayList<Pai>();
		        try {
		            while (rs.next()) {
		            	Pai obj = new Pai();
		            	obj.setPk_pai(rs.getInt(1));
		            	obj.setNomePai(rs.getString(2));
		            	obj.setRegistrostudbook(rs.getString(3));
		            	
		                listObj.add(obj);
		            }
		            return listObj;
		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		 }
		 public List<Pai> pesquisarTodos() {
		        try {
		            Connection conn = Conexao.conectar();
		            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
		            PreparedStatement ps = conn.prepareStatement(sql);
		            ResultSet rs = ps.executeQuery();
		            List<Pai> listObj = montarLista(rs);
		            return listObj;
		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		    }
			

	}

