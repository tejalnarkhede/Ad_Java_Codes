import java.awt.*;
import java.awt.event.*;

public class DemoComponents extends Frame {
	
	DemoComponents()
	{
	Button bsubmit=new Button("Submit");
	add(bsubmit);
	
	Label l=new Label("Courses");
	add(l);

	Choice c=new Choice();
	c.setBounds(100,100,75,75);
	c.add("C");
	c.add("C++");
	c.add("Java");
	c.add("Android");
	add(c);
	setSize(400,400);
	setVisible(true);
	setLayout(null);
	}
}

public static void main(String[] args)
{
	new DemoComponents();
	
}
	