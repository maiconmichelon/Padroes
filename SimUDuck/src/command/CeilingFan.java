package command;

public class CeilingFan {

	private String local;

	public CeilingFan(String local) {
		this.local = local;
	}
	
	public CeilingFan() {
	}

	public void on() {
		System.out.println("on ceiling");
	}

	public void off() {
		System.out.println("off ceiling");
	}

}
