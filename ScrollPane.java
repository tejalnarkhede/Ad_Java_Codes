import javax.swing.*;

public class ScrollPane
{
public static void main(String[] args)
{
	JFrame jf=new JFrame();
	JPanel jp=new JPanel();
	JTextArea ta=new JTextArea(10,10);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JScrollPane sp=new JScrollPane(ta);
	jp.add(sp);
	jf.setContentPane(jp);
	jf.setSize(400,400);	
	jf.setVisible(true);
	
}


}