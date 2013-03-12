package template;

public class Prepare {

	public static void main(String[] args) {
		CaffeineBeverage cbTea = new Tea();
		cbTea.prepareRecipient();
		
		CaffeineBeverage cbCoffe = new Coffe();
		cbCoffe.prepareRecipient();
	}
	
}
