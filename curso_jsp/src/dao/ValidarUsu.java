package dao;

public class ValidarUsu {
	
	public boolean validar(String login,String senha) {
		daoUsuario con = new daoUsuario();
		if (con.consultar(login, senha)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		ValidarUsu vu = new ValidarUsu();
		System.out.println(vu.validar("jonas", "jonas202"));
	}
		
		
		
	

	

}
