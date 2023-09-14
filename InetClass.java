import java.io.*;  
import java.net.*;  
public class InetClass{  
public static void main(String[] args){  
try{ 
	InetAddress locl=InetAddress.getLocalHost();
	System.out.println("Local host name"+locl.getHostName());
	System.out.println("Local host name"+locl.getHostAddress());
InetAddress ip=InetAddress.getByName("www.google.com");  
 
System.out.println("Host Name: "+ip.getHostName());  
System.out.println("IP Address: "+ip.getHostAddress());  
}catch(Exception e){System.out.println(e);}  
}  
}  

