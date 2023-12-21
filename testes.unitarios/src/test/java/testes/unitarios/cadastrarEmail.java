package testes.unitarios;

public class cadastrarEmail {

	
	public static boolean validarEmail(String email) {
		
		
		
		return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
	}
	
}
