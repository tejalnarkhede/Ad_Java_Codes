import java.rmi.*;  
import java.rmi.registry.*;  
public class MyServer{  
public static void main(String args[]){  
try{  
Adder stub=new AdderRemote();  
Naming.rebind("hello",stub);  
System.out.println("Server start");
}catch(Exception e){System.out.println(e);}  
}  
}  