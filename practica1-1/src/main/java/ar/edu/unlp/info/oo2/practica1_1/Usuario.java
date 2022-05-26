package ar.edu.unlp.info.oo2.practica1_1;

import java.util.ArrayList;

public class Usuario {

	private String screenName;
	private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
	private ArrayList<ReTweet> reTweets = new ArrayList<ReTweet>();

	//	Constructor
	public Usuario(String screenName) {
		this.setScreenName(screenName);
	}
	
	// Obtener nombre de usuario
	public String getScreenName() {
		return this.screenName;
	}
	
	// Obtener tweets el usuario
	public ArrayList<Tweet> getTweets() {
		return this.tweets;
	}
	
	// Obtener tweets el usuario
	public ArrayList<ReTweet> getReTweets() {
		return this.reTweets;
	}
	
	// Setear nombre de usuario (screen Name)
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	// Crear tweet
	public Tweet tweetear(String texto) {
		Tweet tweet = Tweet.crearTweet(texto, this);
		this.tweets.add(tweet);
		return tweet;
	}
	
	// Retweetear un tweet
	public ReTweet retweetear(Tweet tweet) {
		ReTweet reTweet = new ReTweet(tweet, this);
		this.reTweets.add(reTweet);
		return reTweet;
	}

	// Eliminar tweet (retorna verdadero/falso si el tweet se encotró y se borró)
	public boolean eliminarTweet(Tweet tweet) {
		if (this.tweets.contains(tweet)) {
		    return this.tweets.remove(tweet);
		}
		return false;
	}

}
