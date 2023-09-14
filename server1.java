import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
interface one extends Remote{
public void print(int a,int b) throws 
RemoteException;
}
class msg extends UnicastRemoteObject 
implements one{
msg() throws RemoteException{
super();
}
public void print(int a,int b){System.out.println("Division is "+(a/b));
}
}
public class server1 extends msg {
public server1() throws RemoteException{
super();
}
public static void main(String[] args){
try{
LocateRegistry.createRegistry(12000);
one obj = new msg();
Naming.rebind("rmi://localhost:12000/server", 
obj);
System.out.println("Server Started Successfully..!");
}catch(Exception e){
System.out.println(e.getMessage());
}
}
}