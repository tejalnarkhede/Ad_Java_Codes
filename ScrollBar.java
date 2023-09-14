import java.awt.*;  
class ScrollBar{  
ScrollBar(){  
            Frame f= new Frame("Simple Scrollbar");  
            Scrollbar s=new Scrollbar();  
            s.setBounds(100,100, 50,100);  
	    s.setBackground(Color.yellow);
            f.add(s);  
            f.setSize(400,400);  
            f.setLayout(null);  
            f.setVisible(true);  
}  
public static void main(String args[]){  
       new ScrollBar();  
}  
}  