import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class fontDemo extends Frame {
       
   public fontDemo(){
      super("Java AWT Examples");
      prepareGUI();
   }

   public static void main(String[] args){
      fontDemo  fd = new fontDemo();  
      fd.setVisible(true);
   }

   private void prepareGUI(){
      setSize(400,400);
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      }); 
   }    

   @Override
   public void paint(Graphics g) {
      Graphics2D g2 = (Graphics2D)g;        
      Font plainFont = new Font("Serif", Font.PLAIN, 24);        
      g2.setFont(plainFont);
      g2.drawString("Welcome to Java Programming 2", 50, 70); 
      Font italicFont = new Font("Serif", Font.ITALIC, 24);        
      g2.setFont(italicFont);
      g2.drawString("Welcome to Java Programming 2", 50, 120); 
      Font boldFont = new Font("Serif", Font.BOLD, 24);        
      g2.setFont(boldFont);
      g2.drawString("Welcome to Java Programming 2", 50, 170); 
      Font boldItalicFont = new Font("Serif", Font.BOLD+Font.ITALIC, 24);        
      g2.setFont(boldItalicFont);
      g2.drawString("Welcome to Java Programming 2", 50, 220); 
   }
}