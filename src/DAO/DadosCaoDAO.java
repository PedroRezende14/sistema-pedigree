package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import Conexao.*;
import DTO.*;


public class DadosCaoDAO {
	
	final String NOMEDATABELA = "dadoscao";
	public boolean inserir(DadosCao DadosCao){
		
		 try {
	            Connection conn = Conexao.conectar();
	            
	            String sql = "INSERT INTO dadoscao (nomeCao, Raca, RegistroStudBook, Cor, OrigemRaca,  criador, sexo ) VALUES (?, ?, ?, ?, ?, ?, ?);";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, DadosCao.getNomeCao());
	            ps.setString(2, DadosCao.getRaca());
	            ps.setString(3, DadosCao.getRegistroStudBook());
	            ps.setString(4, DadosCao.getCor());
	            ps.setString(5, DadosCao.getOrigemRaca());
	            ps.setString(6, DadosCao.getCriador());
	            ps.setString(7, DadosCao.getSexo());
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
	

	public boolean Excluir(DadosCao DadosCao){
		 try {
	            Connection conn = Conexao.conectar();
	            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE nMicroChip = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, DadosCao.getnMicroChip());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	}
	

	
	
	public boolean alterar(DadosCao DadosCao){
		try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET nomecao=?, raca=?, registrostudbook=?, cor=?, origemraca=?, criador=?, sexo=?" + " WHERE nmicrochip = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, DadosCao.getNomeCao());
            ps.setString(2, DadosCao.getRaca());
            ps.setString(3, DadosCao.getRegistroStudBook());
            ps.setString(4, DadosCao.getCor());
            ps.setString(5, DadosCao.getOrigemRaca());
            ps.setString(6, DadosCao.getCriador());
            ps.setString(7, DadosCao.getSexo());
            ps.setInt(8, DadosCao.getnMicroChip());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
	}
	
	
	
	public DadosCao procurarPorCodigo(DadosCao DadosCao){
		  try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nmicrochip = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            System.out.println();
	            ps.setInt(1,DadosCao.getnMicroChip());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                DadosCao obj = new DadosCao();
	                
	                
	                System.out.println("======================================");
	                System.out.println("          Dados Do Cachorro");
	                int nMicroChip = rs.getInt("nmicrochip");
	                System.out.print("nmicrochip: "+ nMicroChip);
	                
	                String nomecao = rs.getString("nomecao");
	                System.out.print(",nome: "+ nomecao);
	                
	                String bock = rs.getString("registrostudbook");
	                System.out.println(",RegistroBook:"+ bock);
	                
	                String origemraca = rs.getString("origemraca");
	                System.out.print(",origem raca: "+ origemraca);
	                
	                String cor = rs.getString("cor");
	                System.out.print(",cor: "+ cor);
	                
	                String criador = rs.getString("criador");
	                System.out.print(",criador: "+ cor);
	                
	                String sexo = rs.getString("sexo");
	                System.out.println(",sexo: "+ cor);
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
	
	 public List<DadosCao> montarLista(ResultSet rs) {
	        List<DadosCao> listObj = new ArrayList<DadosCao>();
	        try {
	            while (rs.next()) {
	            	DadosCao obj = new DadosCao();
	                obj.setnMicroChip(rs.getInt(1));
	                obj.setNomeCao(rs.getString(2));
	                obj.setRaca(rs.getString(3));
	                obj.setCor(rs.getString(4));
	                obj.setOrigemRaca(rs.getString(5));
	                obj.setRegistroStudBook(rs.getString(6));
	                obj.setSexo(rs.getString(7));
	                obj.setCriador(rs.getString(8));
	                listObj.add(obj);
	            }
	            return listObj;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	 }
	 public List<DadosCao> pesquisarTodos() {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            List<DadosCao> listObj = montarLista(rs);
	            return listObj;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
		
		 
	
	
	  
	
	
}
