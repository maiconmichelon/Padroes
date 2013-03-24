package state;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import proxy.GumballMachineRemote;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

	private State soldOutState;
	private State soldState;
	private State noQuarterState;
	private State hasQuarterState;
	private State winnerState;

	private State state = getSoldOutState();
	private int count = 0;
	private final String location;
	
	public GumballMachine(String location ,int numberGumballs) throws RemoteException{
		setSoldOutState(new SoldOutState(this));
		setSoldState(new SoldState(this));
		setNoQuarterState(new NoQuarterState(this));
		setHasQuarterState(new HasQuarterState(this));
		setWinnerState(new WinnerState(this));
		
		this.location = location;
		this.count = numberGumballs;
		if(numberGumballs > 0 )
			state = getNoQuarterState();
	}
	
	public void insertQuarter(){
		state.insertQuarter();
	}
	
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	
	public void turnCranck(){
		state.turnCrank();
		state.dispense();
	}

	public void dispense() {
		state.dispense();
	}
	
	public void setState(State state){
		this.state = state;
	}
	
	public void releaseGumball(){
		System.out.println("A goma esta chegandoOOooO");
		if(count != 0 )
			count --;
	}
	
	@Override
	public String toString() {
		return count + " gomas, estado " + state ;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public int getCount() {
		return this.count;
	}

	public State getWinnerState() {
		return winnerState;
	}

	public void setWinnerState(State winnerState) {
		this.winnerState = winnerState;
	}

	public String getLocation() {
		return location;
	}

	public State getState() {
		return this.state;
	}
}