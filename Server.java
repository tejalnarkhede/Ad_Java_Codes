import java.rmi.registry.*;
import java.rmi.*;
import java.rmi.server.*;

public class Server extends addExample
{
	public Server(){}
	public static void main(String args[])
	{
		try
		{
		addExample obj=new addExample();
		Addition stub=(Addition)UnicastRemoteObject.exportObject(obj,0);
		Registry registry=LocateRegistry.getRegistry();
		registry.bind("Addition",stub);
		System.out.println("Server is Ready Now");
		}
		catch(Exception e)
		{
		System.out.println("Server Exception",e.toString());
		e.printStackTrace();
		}
	}

}