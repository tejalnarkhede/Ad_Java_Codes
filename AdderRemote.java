import java.rmi.*;  
import java.rmi.server.*;  
public class AdderRemote extends UnicastRemoteObject implements Adder{  
AdderRemote()throws RemoteException{  
super();  
}  
 public void Even(int limit)throws RemoteException
    {
        System.out.println("Even number till "+limit);
        for(int i=0;i<=limit;i+=2)
        {
            System.out.println(i);
        }
    }
     public void Odd(int limit)throws RemoteException
    {
        System.out.println("Odd number till "+limit);
        for(int i=1;i<=limit;i+=2)
        {
            System.out.println(i);
        }
    }
}  