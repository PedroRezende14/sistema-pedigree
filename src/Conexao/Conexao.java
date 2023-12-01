package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	final static String ProjetoFinal = "mvcsimplesjdbc";
	
    public static Connection conectar() {
    	try {
//    		Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/projetofinal" ;
            return DriverManager.getConnection(url,"root","");
            
        } catch (Exception e) {
        	e.printStackTrace();
            return null;
        }

}
}