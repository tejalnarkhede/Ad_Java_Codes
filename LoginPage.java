import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener {

	Container container=getContentPane();
	RegisterPage r;
	JLabel lusername=new JLabel("USERNAME");
	JLabel lpassword=new JLabel("PASSWORD");
	JCheckBox showpassword=new JCheckBox("Show Password");
	JTextField textusername=new JTextField();
	JPasswordField textpassword=new JPasswordField();
	JButton bLogin=new JButton("Login");
	JButton breset=new JButton("Reset");
	
	public LoginPage()
	{
		addComponentstoContainer();
		setLocations();
		setLayout();
		setActionEvent();
	}

	public  void addComponentstoContainer() {
		// TODO Auto-generated method stub
		container.add(lusername);
		container.add(lpassword);
		container.add(textusername);
		container.add(textpassword);
		container.add(showpassword);
		container.add(bLogin);
		container.add(breset);
	}
	
	public void setLayout() {
		// TODO Auto-generated method stub
		container.setLayout(null);
	}
	
	public void setLocations() {
		// TODO Auto-generated method stub
		 	lusername.setBounds(50, 150, 100, 30);
	        lpassword.setBounds(50, 220, 100, 30);
	        textusername.setBounds(150, 150, 150, 30);
	        textpassword.setBounds(150, 220, 150, 30);
	        showpassword.setBounds(150, 250, 150, 30);
	        bLogin.setBounds(50, 300, 100, 30);
	        breset.setBounds(200, 300, 100, 30);
	}	
	
	public void setActionEvent() {
		// TODO Auto-generated method stub
		bLogin.addActionListener(this);
		breset.addActionListener(this);
		showpassword.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bLogin)
		{
			String usrtext = textusername.getText();
			String passtext = textpassword.getText();
			if(usrtext.equalsIgnoreCase("TKN")&&passtext.equalsIgnoreCase("TKN@123"))
			{
				JOptionPane.showMessageDialog(this,"Login Successful..!");
				container.setVisible(false);
				
				
			}
			else
			{
				JOptionPane.showMessageDialog(this,"Login Failed..!");
				//container.setVisible(false);
			}
		
		}
		if(e.getSource()==breset)
		{
			textusername.setText("");
			textpassword.setText("");
		}
		if(e.getSource()==showpassword)
		{
			if(showpassword.isSelected())
			{
				textpassword.setEchoChar((char)0);
			}
			else
			{
				textpassword.setEchoChar('*');
			}
		}
	}

	public static void main(String[] args)
	{
		new LoginPage();
	}
	
	
}
