package decorator;

public class HouseBland extends Beverage{

	public HouseBland() {
		this.description = "House Bland Coffee";
	}

	@Override
	public double cost() {
		return 0.89;
	}
	
}
