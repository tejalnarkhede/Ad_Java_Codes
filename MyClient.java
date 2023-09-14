import java.rmi.*;  
public class MyClient{  
public static void main(String args[]){  
try{  
Adder stub=(Adder)Naming.lookup("hello");  
 stub.Even(10);   
}catch(Exception e){}  
}  
} 