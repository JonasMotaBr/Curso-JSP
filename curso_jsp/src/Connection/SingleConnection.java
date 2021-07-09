package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.Filter;

public class SingleConnection {
	
	private static Connection conexao=null;
	private static String url="jdbc:mysql://localhost:3308/curso_jsp?verifyServerCerticate=false&useSSL=true";
	private static String user="root";
	private static String password="";
	
	static {
		conectar();
	}
	
	//construtor chamar metodo conectar
	public SingleConnection() {
		conectar();
	}
	
	public static void  conectar() {		
		try {
			
				Class.forName("com.mysql.jdbc.Driver");
			   conexao= DriverManager.getConnection(url, user, password);
			   conexao.setAutoCommit(false);
			
			
		 } catch (SQLException e) {
			throw new RuntimeException(e);
	   } catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public static Connection getConexao() {
		return conexao;
	}
	
}
