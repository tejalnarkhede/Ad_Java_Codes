import java.awt.*;
import java.io.*;
import java.util.*;

public class helloworld extends Canvas implements Serializable
{
	private String msg;
	
	public helloworld()
	{
		msg="Hello World..! ";
		setSize(250,50);
		setBackground(Color.red);
	}

	public void setMsg(String msg)
	{
		this.msg=msg;
	}
	public String getMsg(String msg)
	{
		return msg;
	}
	
	public void paint(Graphics g)
	{	
		g.drawString(msg,20,20);
	}

}