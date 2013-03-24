package proxy;

import java.rmi.Naming;

public class MyRemoteCliente {

	public static void main(String[] args) {
		new MyRemoteCliente().go();
	}

	private void go() {
		try{
			MyRemote remote = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
			String s = remote.sayHello();
			
			System.out.println(s);
		}catch(Exception ex ){
			System.err.println(ex.getMessage());
		}
	}
	
}
