package model;

import java.util.ArrayList;

public class BaseDados {
	public static ArrayList<Usuario> Usuarios = new ArrayList<>();
	
	
	
	public static boolean verificar(Usuario usuario) {
		for (Usuario user : Usuarios) {
			if(user.getSenha().equals(usuario.getSenha()) && 
					user.getLogin().equalsIgnoreCase(usuario.getLogin()))
			{
				return true;
			}
		}
		return false;
		
	}

}
