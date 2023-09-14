import java.io.*;
import java.net.*;

public class ChatServer extends Thread
{
String ServerName,Message;
private ServerSocket server;
public ChatServer(int port) throws Exception
{
server=new ServerSocket(port);
server.setSoTimeout(0);
}

public void run()
{
while(true)
{
try
{
Socket conn = server.accept();

DataInputStream in = new DataInputStream(conn.getInputStream());
String news=in.readUTF();

String news1=in.readUTF();

DataOutputStream out=new DataOutputStream(conn.getOutputStream());
out.writeUTF(news+news1);
conn.close();
}
catch(Exception e){e.printStackTrace();}

}
}

public static void main(String[] args) throws Exception
{
int port=Integer.parseInt(args[0]);
Thread t=new ChatServer(port);
t.start();
}}
