import java.awt.*;
import java.io.*;
import java.util.*;

public class exampleBean extends Canvas implements Serializable
{
	public String str1;
	public String str2;
	public String ans;
	public exampleBean()
	{
		str1="0";
		str2="0";
		ans="0";
		setSize(100,100);
		setBackground(Color.red);
	}

	public void setStr1(String str1)
	{
		this.str1=str1;
		setAns(str1+str2);
		repaint();
	}
	public String getStr1(String str1)
	{
		return str1;
	}
	public void setStr2(String str2)
	{
		this.str2=str2;
		setAns(str1+str2);
		repaint();
	}
	public String getStr2(String str2)
	{
		return str2;
	}

	public void setAns(String ans)
	{
		this.ans=ans;
	}
	public String getAns(String ans)
	{
		return ans;
		repaint();
	}
	public void paint(Graphics g)
	{	
		g.drawString(str1,20,30);
		g.drawString("+",30,20);
		g.drawString(str2,20,30);
		g.drawString("=",50,20);
		g.drawString(ans,60,20);		
	}

}