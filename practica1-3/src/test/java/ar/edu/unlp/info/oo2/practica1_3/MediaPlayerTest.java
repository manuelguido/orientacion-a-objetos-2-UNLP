package ar.edu.unlp.info.oo2.practica1_3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MediaPlayerTest {

	private MediaPlayer mediaPlayer;
	private Media media;
	private Audio audio;
	private VideoFile videoFile;
	private VideoFile videoStream;

	@BeforeEach
	public void setUp() throws Exception {
		mediaPlayer = new MediaPlayer();
		media = new Media();
		audio = new Audio();
		videoFile = new VideoFile();
		videoStream = new VideoFile(true);
		mediaPlayer.addMedia(media);
		mediaPlayer.addMedia(audio);
		mediaPlayer.addMedia(videoFile);
		mediaPlayer.addMedia(videoStream);
	}

	@Test
	public void testFuncionPlay() {
		assertEquals(media.play(), "Play desde Media");
		assertEquals(audio.play(), "Play desde Audio");
		assertEquals(videoFile.play(), "Play desde VideoFile");
		assertEquals(videoStream.play(), "Play desde VideoStream");
		
		System.out.println("-------------------");
		
		mediaPlayer.playAllMedia();
	}
}
