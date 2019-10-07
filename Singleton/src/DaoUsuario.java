import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DaoUsuario {
	
private Connection connection;
	
	public DaoUsuario() {
		connection= Singleton.getConnection();
	}
	
	public void salvar(Bean usuario) {
		
		try {
			String sql = "insert into usuario(login, senha, nome)"
					+ " values(?, ?, ?)";
			PreparedStatement insert = connection.prepareStatement(sql);
			insert.setString(1, usuario.getLogin());
			insert.setString(2, usuario.getSenha());
			insert.setString(3, usuario.getNome());
			
			insert.execute();
			connection.commit();
			
		} catch (Exception e) {
			
				}
			
			
		
		
	}

}
