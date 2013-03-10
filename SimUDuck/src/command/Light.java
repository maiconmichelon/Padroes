package command;

public class Light {

	private boolean ligada;

	public void on(){
		ligada = true;
		System.out.println("light is on");
	}

	public void off(){
		ligada = false;
		System.out.println("light is off");
	}
	
}
