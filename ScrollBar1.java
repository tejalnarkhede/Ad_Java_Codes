import java.awt.*;  
import java.awt.event.*;  
public class ScrollBar1{  
     ScrollBar1(){  
            Frame f= new Frame("Scrollbar with AdjustmentListener");  
             Label label = new Label();          
            label.setAlignment(Label.CENTER);  
            label.setSize(400,100);  
            Scrollbar s=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);  
            s.setBounds(250,100,300,30);
            s.setBackground(Color.yellow); 
            f.add(s);
            f.add(label);   
            f.setSize(400,400);  
            f.setLayout(null);  
            f.setVisible(true);  
            s.addAdjustmentListener(new AdjustmentListener() {  
                public void adjustmentValueChanged(AdjustmentEvent e) {  
                   label.setText("Vertical Scrollbar value is:"+ s.getValue());  
                }  
            });  
         }
public static void main(String args[]){  
new ScrollBar1();  
}  
}   
 