import javax.swing.*;  
import javax.swing.tree.DefaultMutableTreeNode;  
public class TreeExample {  
JFrame f;  
TreeExample(){  
    f=new JFrame();   
    DefaultMutableTreeNode documents=new DefaultMutableTreeNode("Documents");  
    DefaultMutableTreeNode ass=new DefaultMutableTreeNode("6th Sem Assignments");  
    DefaultMutableTreeNode jp2=new DefaultMutableTreeNode("JP2 Assignments");  
    DefaultMutableTreeNode th=new DefaultMutableTreeNode("Theory");  
    DefaultMutableTreeNode pr=new DefaultMutableTreeNode("Practical");  
    DefaultMutableTreeNode jsp=new DefaultMutableTreeNode("JSP Assignments");  

    documents.add(ass);
    ass.add(jp2);
    jp2.add(th);
    jp2.add(pr); 
    documents.add(jsp);

    DefaultMutableTreeNode th_unit1=new DefaultMutableTreeNode("TheoryUnit1.pdf");  
    DefaultMutableTreeNode th_unit2=new DefaultMutableTreeNode("TheoryUnit2.pdf");  
    DefaultMutableTreeNode pr_1to5=new DefaultMutableTreeNode("Practical 1to5.pdf");  
    DefaultMutableTreeNode pr_6to8=new DefaultMutableTreeNode("Practical 6to8.pdf");  
    th.add(th_unit1); th.add(th_unit2); pr.add(pr_1to5); pr.add(pr_6to8);      
    JTree jt=new JTree(documents);  
    f.add(jt);  
    f.setSize(200,200);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new TreeExample();  
}}  