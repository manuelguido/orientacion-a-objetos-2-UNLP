package ar.edu.unlp.info.oo2.practica1_3;

import java.util.ArrayList;

public class MediaPlayer {

	private ArrayList<Media> media = new ArrayList<Media>();

	public ArrayList<Media> getMedia() {
		return media;
	}
	
	public void addMedia(Media newMediaFile) {
		media.add(newMediaFile);
	}
	
	// Reproducir todo el contenido
	public void playAllMedia() {
		for(Media current: this.media) {
			current.play();
		}
	}
}
