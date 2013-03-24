package proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

	protected MyRemoteImpl() throws RemoteException {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String sayHello() throws RemoteException {
		return "Server says HELLO!";
	}

	public static void main(String[] args) {
		try{
			MyRemote service = new MyRemoteImpl();
			Naming.bind("RemoteHello", service);
		}catch(Exception ex){
			System.err.println(ex.getMessage());
		}
	}
	
}
