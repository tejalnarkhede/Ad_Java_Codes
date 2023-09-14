import java.rmi.registry.*;

public class Client
{
	private Client()
	{}
	public static void main(String[] args)
	{
	try
	{
	Registry registry=LocateRegistry.getRegistry(null);
	Addition stub=(Addition)registry.lookup("Addition");
	stub.add();
	}
	catch(Exception e)
	{
	System.out.println("Client exception:"+e.toString());
	e.printStackTrace();
	}
	}	
}