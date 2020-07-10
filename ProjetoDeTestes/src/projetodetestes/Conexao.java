
package projetodetestes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
  /**
  * Classe de conexão com o banco de dados
  */
public class Conexao {
    /**
     * Método para conexão com banco 
     */
    public static Connection faz_conexao() throws SQLException{ 
     /**
     * Conexão com o banco ded dados
     */
        try{
    Class.forName("com.mysql.cj.jdbc.Driver");
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3307/db_projeto?useSSL=false&useTimezone=true&serverTimezone=UTC","root","gabriel022531");
		
        }catch(ClassNotFoundException e){
            
            throw new SQLException(e.getException());
        }       
    }  
}
