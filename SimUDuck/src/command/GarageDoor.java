package command;

public class GarageDoor {

	private String local;

	public GarageDoor(String local) {
		this.local = local;
	}
	
	public GarageDoor() {
	}
	
	public void open() {
		System.out.println("Open");
	}
	
	public void down(){
		System.out.println("Down");
	}
	
	public void stop(){
		System.out.println("stop");
	}
	
	public void ligthOn(){
		System.out.println("light on");
	}
	
	public void lightOfF(){
		System.out.println("light off");
	}

}
