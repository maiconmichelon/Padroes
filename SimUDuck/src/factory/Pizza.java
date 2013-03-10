package factory;

public abstract class Pizza {

	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperonni pepperonni;
	
	public abstract void prepare();
	public abstract void bake();
	public abstract void cut();
	public abstract void box();
	
	

}
