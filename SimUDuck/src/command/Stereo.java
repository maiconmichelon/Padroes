package command;

public class Stereo {

	private int volume;
	private String local;

	public Stereo(String local) {
		this.local = local;
	}

	public Stereo() {
	}
	
	public void on() {
		System.out.println("on");
	}

	public void setCD() {
		System.out.println("setting cd");
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
		System.out.println("Volume - "+this.volume);
	}

}
