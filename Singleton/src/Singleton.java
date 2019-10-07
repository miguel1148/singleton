import java.sql.Connection;
import java.sql.DriverManager;

public class Singleton {

	private static String banco = "jdbc:postgresql://localhost:5432/curso-jsp";
	private static String password = "admin";
	private static String user = "postgres";
	
	private static Connection connection = null;
	
	

	public Singleton() {
		conectar();
	}
	
	private static void conectar() {
		try {
			if(connection == null) {
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(banco, user, password);
				connection.setAutoCommit(false);
			}
			
		} catch (Exception e) {
			throw new RuntimeException("Erro ao conctar com o banco de dados");
		}
		
	}
	
	
	public static Connection getConnection() {
		return connection;
	}

}
