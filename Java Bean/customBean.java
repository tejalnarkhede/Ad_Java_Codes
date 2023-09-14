import java.awt.*; 
import java.io.Serializable; 
public class customBean extends Canvas implements Serializable { 
 private String str1; 
 private String str2; 
 private String ans; 

 public customBean(){ 
 str1 = "0"; 
 str2 = "0"; 
 ans = "0"; 
 setBackground(Color.ORANGE); 
 setSize(300,300); 
 } 

 public String getStr1() { 
 return str1; 
 } 
 public void setStr1(String str1) { 
 this.str1= str1; 
 setAns(str1+str2+""); 
 repaint(); 
 } 
 public String getStr2() {
 return str2; 
 } 
 public void setStr2(String str2) { 
 this.str2 = str2; 
 setAns(str1+str2+"");  
repaint(); 
 } 
 public String getAns() { 
 return ans; 
 } 
 public void setAns(String ans) { 
 this.ans = ans; 
 repaint(); 
 }
 
 public void paint(Graphics g){ 
 g.drawString(str1,280,20); 
 g.drawString("+",270,20); 
 g.drawString(str2,240,20); 
 g.drawString("=",250,20); 
 g.drawString(ans,260,20); 

 }
} 
