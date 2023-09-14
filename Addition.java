import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Addition extends Remote
{
int a=5,b=3;
void add(int a,int b) throws RemoteException;
}