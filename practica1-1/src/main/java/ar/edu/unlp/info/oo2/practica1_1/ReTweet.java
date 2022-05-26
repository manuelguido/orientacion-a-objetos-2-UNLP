package ar.edu.unlp.info.oo2.practica1_1;

public class ReTweet extends Tweet {

	private Tweet tweetOriginal;
	
	// Constructor
	public ReTweet(Tweet tweet, Usuario usuario) {
		// No verifica longitur porque ya esta verificada al crear el tweet previo
		super(tweet.getTexto(), usuario);
		this.setTweetOriginal(tweet);
	}
	
	// Obtener tweet original
	public Tweet getTweetOriginal() {
		return this.tweetOriginal;
	}
	
	// Setear tweet original
	public void setTweetOriginal(Tweet tweet) {
		this.tweetOriginal = tweet;
	}

}
