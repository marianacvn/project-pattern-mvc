package app;

import controller.ControleLogin;
import model.BaseDados;
import model.Usuario;
import view.Login;

public class App {
	public static void main(String[] args) {
		Usuario usuario = new Usuario("mariana.carval", "123");
		BaseDados.Usuarios.add(usuario);
		
		Login log = new Login();
		
		ControleLogin l = new ControleLogin(log);
		
		
		
	}

}
