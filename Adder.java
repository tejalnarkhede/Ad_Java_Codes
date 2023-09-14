import java.rmi.*;  
public interface Adder extends Remote{  
 public void Even(int limit)throws RemoteException;
    public void Odd(int limit)throws RemoteException;
}  