package adapter;

public class DuckTeste {

	public static void main(String[] args) {
		Turkey turkey = new WildTurkey();
		turkey.fly();
		turkey.gobble();
		
		Duck duck = new TurkeyAdapter(turkey);
		duck.fly();
		duck.quack();
		
	}
	
}
