import javax.swing.*;
public class DemoLabel
{
public static void main(String[] args)
{
	JFrame f=new JFrame("Swings Label");
	JPasswordField l=new JPasswordField();
	l.setBounds(50,100,95,30);
	f.add(l);
	f.setLayout(null);
	f.setVisible(true);
}
}