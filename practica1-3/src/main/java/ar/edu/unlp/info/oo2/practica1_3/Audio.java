package ar.edu.unlp.info.oo2.practica1_3;

public class Audio extends Media {

	private String myInfo = "Play desde Audio";
	
	public String play() {
		System.out.println(myInfo);
		return myInfo;
	}
}
