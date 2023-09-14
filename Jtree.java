import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class TreeSwing
{
	JFrame jf;
	TreeSwing()
	{
	jf=new JFrame();
	DefaultMutableTreeNode g3=new DefaultMutableTreeNode("G3");
	DefaultMutableTreeNode courses=new DefaultMutableTreeNode("Courses");
	DefaultMutableTreeNode ps=new DefaultMutableTreeNode("Project & Seminar");
	
	g3.add(courses);
	g3.add(ps);
	
	DefaultMutableTreeNode jp2=new DefaultMutableTreeNode("JP2");
	DefaultMutableTreeNode jsp=new DefaultMutableTreeNode("Jsp");
	DefaultMutableTreeNode android=new DefaultMutableTreeNode("Android");	
	
	courses.add(jp2);
	courses.add(jsp);
	courses.add(android);
	
	JTree jt=new JTree(G3);
	jf.add(jt);
	jf.setSize(200,200);
}
}