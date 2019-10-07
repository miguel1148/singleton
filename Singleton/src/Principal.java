
public class Principal {
	
	public static void main(String[] args) {
		
		Bean objeto = new Bean();
		
		objeto.setId( (long) 123);
		objeto.setLogin("abc");
		objeto.setNome("Eu");
		objeto.setSenha("zzzzzz");
		
		DaoUsuario dao = new DaoUsuario();
		dao.salvar(objeto);
	}

}

