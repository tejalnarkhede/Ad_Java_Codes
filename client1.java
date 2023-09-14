import java.rmi.*;
import java.rmi.registry.*;
import java.util.Scanner;
public class client1{
public static void main(String[] args){
try{
LocateRegistry.getRegistry(12000);
one m = (one) 
Naming.lookup("rmi://localhost:12000/server");
System.out.println("Enter 1st Number");
Scanner s = new Scanner(System.in);
int a = s.nextInt();
System.out.println("Enter 2nd Number");
int b = s.nextInt();
m.print(a,b);
s.close();
}catch(Exception e){
System.out.println(e.getMessage());}
}
}
