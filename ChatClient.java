import java.io.*;
import java.net.*;

public class ChatClient
{
public static void main(String[] args) throws Exception
{
String Message;
int port=Integer.parseInt(args[1]);
String hostname=args[0];
while(true)
{     
Socket client=new Socket(hostname,port);

OutputStream out=client.getOutputStream();
DataOutputStream outt=new DataOutputStream(out); 
System.out.println("Enter String 1");
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
Message=in.readLine();
System.out.println("Enter String 2");
String Message2=in.readLine();
outt.writeUTF(Message);
outt.writeUTF(Message2);
InputStream inn=client.getInputStream(); 
DataInputStream ins=new DataInputStream(inn);
System.out.println(ins.readUTF());
client.close();
}

}
}