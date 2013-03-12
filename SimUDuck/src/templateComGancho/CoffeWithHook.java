package templateComGancho;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeWithHook extends CaffeineBeverageWithHook {

	@Override
	public void addCondiments() {
		System.out.println("Dripping coffe through filter");
	}

	@Override
	public void brew() {
		System.out.println("Adding milk and sugar");
	}

	@Override
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		
		if(answer.toLowerCase().startsWith("y"))
			return true;
		return false;
	}

	private String getUserInput() {
		String answer = null;
		
		System.out.println("Would you like milk and sugar with a coffe (y or n ) ?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			answer = br.readLine();
		}catch(Exception ex){
			System.err.println("IO error trying to read your answer");
		}
		
		if(answer == null)
			return "no";
		return answer;
	}
	
}
