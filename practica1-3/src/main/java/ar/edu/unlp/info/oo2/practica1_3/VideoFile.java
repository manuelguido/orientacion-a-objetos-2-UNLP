package ar.edu.unlp.info.oo2.practica1_3;

public class VideoFile extends Media {

	private String myInfo = "Play desde VideoFile";
	private VideoStream videoStream;

	public VideoFile() {
		this.setVideoStream(null);
	}
	
	public VideoFile(Boolean stream) {
		if (stream) {
			videoStream = new VideoStream();
		}
	}

	public String play() {
		if (this.getVideoStream() == null) {
			System.out.println(myInfo);
			return myInfo;
		} else {
			return this.getVideoStream().reproduce();
		}
	}
	
	public void setVideoStream(VideoStream newVideoStream) {
		this.videoStream = newVideoStream;
	}
	
	public VideoStream getVideoStream() {
		return videoStream;
	}
}
