import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MenuExample extends Frame implements ActionListener
{  
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MenuExample(){  
         Frame f= new Frame("Menu and MenuItem Example");  
         MenuBar mb=new MenuBar();  
         Menu menu=new Menu("Courses");  
         Menu submenu=new Menu("Java");  
         MenuItem i1=new MenuItem("JSP");  
         MenuItem i2=new MenuItem("Android");  
         MenuItem i3=new MenuItem("Software Testing");  
         MenuItem i4=new MenuItem("Core Java");  
         MenuItem i5=new MenuItem("Ad.Java");  
         menu.add(i1);  
         menu.add(i2);  
         menu.add(i3);  
         submenu.add(i4);  
         submenu.add(i5);  
         menu.add(submenu);  
         mb.add(menu);  
         f.setMenuBar(mb);  
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true); 
         
         menu.addActionListener(this);
}  

public void actionPerformed(ActionEvent e)
  {
    String str = e.getActionCommand();		// know the menu item selected by the user
    JOptionPane.showMessageDialog(this,"You Selected "+str);
    System.out.println("You selected " + str);
  }

public static void main(String args[])  
{  
new MenuExample();  
}  
}  