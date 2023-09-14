import java.awt.*; 
import java.io.Serializable; 
public class cusbean extends Canvas implements Serializable { 
 private String num1; 
 private String num2; 
 private String op; 

 public cusbean(){ 
 num1 = "0"; 
 num2 = "0"; 
 op = "0"; 
 setBackground(Color.ORANGE); 
 setSize(100,100); 
 } 

 public String getNum1() { 
 return num1; 
 } 
 public void setNum1(String num1) { 
 this.num1 = num1; 
 setOp(Integer.parseInt(num1)/Integer.parseInt(num2)+""); 
 repaint(); 
 } 
 public String getNum2() {
 return num2; 
 } 
 public void setNum2(String num2) { 
 this.num2 = num2; 
 setOp(Integer.parseInt(num1)/Integer.parseInt(num2)+"");  
repaint(); 
 } 
 public String getOp() { 
 return op; 
 } 
 public void setOp(String op) { 
 this.op = op; 
 repaint(); 
 }
 
 public void paint(Graphics g){ 
 g.drawString(num1,20,20); 
 g.drawString("/",30,20); 
 g.drawString(num2,40,20); 
 g.drawString("=",50,20); 
 g.drawString(op,60,20); 

 }
} 
