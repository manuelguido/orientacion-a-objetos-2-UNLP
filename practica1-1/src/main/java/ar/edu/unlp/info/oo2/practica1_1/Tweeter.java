package ar.edu.unlp.info.oo2.practica1_1;

import java.util.ArrayList;

public class Tweeter {

	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	// Obtener usuarios
	public ArrayList<Usuario> getUsuarios() {
		return this.usuarios;
	}
	
	// Crear un nuevo usuario
	public void crearUsuario (String screenName) {
		// Corroborar que el nombre de usuario no exista
		if (this.usuarioScreenNameOk(screenName)) {
			//	Crear usuario
			Usuario usuario = new Usuario(screenName);
			this.usuarios.add(usuario);
		} else {
			System.out.print("el nombre de usuario "+ screenName + " ya está registrado.");
		}
	}
	
	// Eliminar un usuario
	public void eliminarUsuario (Usuario usuario) {
		usuario.getTweets().clear();
		this.getUsuarios().remove(usuario);
	}

	
	// Saber si el nombre de usuario existe o no
	private Boolean usuarioScreenNameOk(String screenName) {
		Usuario existe = this.getUsuarios()
				.stream()
				.filter(usuario -> 
					screenName.equals(usuario.getScreenName()))
				.findAny()
				.orElse(null);
		return (existe == null);
	}

}
