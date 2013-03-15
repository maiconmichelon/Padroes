package command;

public class CeilingFan {

	public static int HIGH = 3;
	public static int MEDIUM = 2;
	public static int LOW = 1;
	public static int OFF = 0;
	int speed;
	
	private String local;

	public CeilingFan(String local) {
		this.local = local;
		speed =  OFF;
	}
	
	public CeilingFan() {
	}

	public void high(){
		speed = HIGH;
		System.out.println("high");
	}
	
	public void medium(){
		speed = MEDIUM;
		System.out.println("medium");
	}
	
	public void low(){
		speed = LOW;
		System.out.println("low");
	}

	public void off() {
		speed = OFF;
		System.out.println("off ceiling");
	}
	
	public int getSpeed() {
		return speed;
	}

}
