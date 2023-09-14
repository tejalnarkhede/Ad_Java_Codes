import javax.swing.*;
public class Tabbed_Pane
{
	JFrame jf;
	Tabbed_Pane()
	{
		jf=new JFrame("TabbedPane");
		JPanel p1=new JPanel();
		p1.add(new JLabel("This is File Tab..."));
		JPanel p2=new JPanel();
		p2.add(new JLabel("This is Edit Tab..."));
		JPanel p3=new JPanel();
		p3.add(new JLabel("This is Format Tab..."));
		JPanel p4=new JPanel();
		p4.add(new JLabel("This is View Tab..."));
		JPanel p5=new JPanel();
		p5.add(new JLabel("This is Help Tab..."));
	
		JTabbedPane jp=new JTabbedPane(JTabbedPane.LEFT);
		jp.setBounds(50,50,300,300);
		jp.add("File",p1);
		jp.add("Edit",p2);
		jp.add("Format",p3);
		jp.add("View",p4);
		jp.add("Help",p5);
		
		jf.add(jp);
		jf.setSize(400,400);
		jf.setLayout(null);	
		jf.setVisible(true);
		
	}
	public static void main(String[] args)
	{
		new Tabbed_Pane();
		
	}

}
