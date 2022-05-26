package ar.edu.unlp.info.oo2.practica1_1;

public class Tweet {

	private String texto;
	private Usuario usuario;

	// Crear tweet (varificar longitud del mismo)
	public static Tweet crearTweet(String texto, Usuario usuario) {
	    if (texto.length() > 140 || texto.length() < 1) {
	    	System.out.print("La longitud del tweet debe ser entre 1 y 140 caracteres.");
	    	return null;
	    }
	    else {
	    	Tweet tweet = new Tweet(texto, usuario);
	    	return tweet;
	    }
	}
	
	// Constructor
	public Tweet(String texto, Usuario usuario) {
		this.setTexto(texto);
		this.setUsuario(usuario);
	}
	
	// Obtener texto
	public String getTexto() {
		return this.texto;
	}
	 
	// Setear texto
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	// Obtener texto
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	// Setear texto
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
